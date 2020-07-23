package com.login_signup_screendesign_demo.Fragment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.login_signup_screendesign_demo.API.LoginApi;
import com.login_signup_screendesign_demo.Activity.MainActivity;
import com.login_signup_screendesign_demo.CustomToast;
import com.login_signup_screendesign_demo.Model.BodySendPassword;
import com.login_signup_screendesign_demo.Model.ResponseSendPassword;
import com.login_signup_screendesign_demo.R;
import com.login_signup_screendesign_demo.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ForgotPassword_Fragment extends Fragment implements
		OnClickListener {
	private static View view;
	private static EditText emailId;
	private static TextView submit, back;
	private static ProgressBar progressBarForgotPassword;

	Retrofit retrofit;
	LoginApi loginApi;

	public ForgotPassword_Fragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.forgotpassword_layout, container,
				false);
		retrofit = new Retrofit.Builder()
				.baseUrl("https://www.innerworkindia.com/")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		loginApi = retrofit.create(LoginApi.class);
		initViews();
		setListeners();
		return view;
	}

	// Initialize the views
	private void initViews() {
		emailId = (EditText) view.findViewById(R.id.registered_emailid);
		submit = (TextView) view.findViewById(R.id.forgot_button);
		back = (TextView) view.findViewById(R.id.backToLoginBtn);
		progressBarForgotPassword = (ProgressBar) view.findViewById(R.id.progressBarForgotPassword);
		// Setting text selector over textviews`

	}

	// Set Listeners over buttons
	private void setListeners() {
		back.setOnClickListener(this);
		submit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.backToLoginBtn:

			// Replace Login Fragment on Back Presses
			new MainActivity().replaceLoginFragment();
			break;

		case R.id.forgot_button:

			// Call Submit button task
			submitButtonTask();
			break;

		}

	}

	private void submitButtonTask() {
		String getEmailId = emailId.getText().toString();

		// Pattern for email id validation
		Pattern p = Pattern.compile(Utils.regEx);

		// Match the pattern
		Matcher m = p.matcher(getEmailId);

		// First check if email id is not null else show error toast
		if (getEmailId.equals("") || getEmailId.length() == 0)

			new CustomToast().Show_Toast(getActivity(), view,
					"Please enter your Email Id.");

		// Check if email id is valid or not
		else if (!m.find())
			new CustomToast().Show_Toast(getActivity(), view,
					"Your Email Id is Invalid.");

		// Else submit email id and fetch passwod or do your stuff
		else{
			progressBarForgotPassword.setVisibility(View.VISIBLE);
			Call<ResponseSendPassword> call = loginApi.sendPassword(new BodySendPassword(getEmailId));
			call.enqueue(new Callback<ResponseSendPassword>() {
				@Override
				public void onResponse(Call<ResponseSendPassword> call, Response<ResponseSendPassword> response) {
					if(!response.isSuccessful()){
						new CustomToast().Show_Toast(getActivity(), view,
								response.message());
						//Toast.makeText(getContext(), "Failed to send password to mail ID. "+response.message(), Toast.LENGTH_SHORT).show();
						progressBarForgotPassword.setVisibility(View.GONE);
						return;
					}
					progressBarForgotPassword.setVisibility(View.GONE);
					ResponseSendPassword responseSendPassword = response.body();
					new CustomToast().Show_Toast(getActivity(), view,
							responseSendPassword.getMessage());
				}

				@Override
				public void onFailure(Call<ResponseSendPassword> call, Throwable t) {
					progressBarForgotPassword.setVisibility(View.GONE);
					new CustomToast().Show_Toast(getActivity(), view,
							"Failed to request server. Try again later. " + t.getLocalizedMessage());
					//Toast.makeText(getContext(), "Failed to request server. Try again later. ", Toast.LENGTH_SHORT).show();
					Log.i("ForgetPassword_Fragment", "onFailure: " + t.getLocalizedMessage());
				}
			});
		}
	}
}