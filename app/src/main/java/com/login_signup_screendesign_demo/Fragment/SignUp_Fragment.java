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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.login_signup_screendesign_demo.API.LoginApi;
import com.login_signup_screendesign_demo.Activity.MainActivity;
import com.login_signup_screendesign_demo.CustomToast;
import com.login_signup_screendesign_demo.Model.BodySignUpUser;
import com.login_signup_screendesign_demo.Model.ResponseSignUpUser;
import com.login_signup_screendesign_demo.R;
import com.login_signup_screendesign_demo.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUp_Fragment extends Fragment implements OnClickListener {
	private static View view;
	private static EditText fullName, emailId, mobileNumber, location,
			password, confirmPassword;
	private static TextView login;
	private static Button signUpButton;
	private static CheckBox terms_conditions, isIntern, isJob;
	private static ProgressBar progressBar;

	Retrofit retrofit;
	LoginApi loginApi;

	public SignUp_Fragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.signup_layout, container, false);

		retrofit = new Retrofit.Builder()
				.baseUrl("https://www.innerworkindia.com/android/")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		loginApi = retrofit.create(LoginApi.class);

		initViews();
		setListeners();
		return view;
	}

	// Initialize all views
	private void initViews() {
		fullName = (EditText) view.findViewById(R.id.fullName);
		emailId = (EditText) view.findViewById(R.id.userEmailId);
		mobileNumber = (EditText) view.findViewById(R.id.mobileNumber);
		location = (EditText) view.findViewById(R.id.location);
		password = (EditText) view.findViewById(R.id.password);
		confirmPassword = (EditText) view.findViewById(R.id.confirmPassword);
		signUpButton = (Button) view.findViewById(R.id.signUpBtn);
		login = (TextView) view.findViewById(R.id.already_user);
		terms_conditions = (CheckBox) view.findViewById(R.id.terms_conditions);
		isJob = (CheckBox) view.findViewById(R.id.job);
		isIntern = (CheckBox) view.findViewById(R.id.intern);
		progressBar = (ProgressBar) view.findViewById(R.id.progresBarSignUp);
		// Setting text selector over textviews

	}

	// Set Listeners
	private void setListeners() {
		signUpButton.setOnClickListener(this);
		login.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.signUpBtn:

			// Call checkValidation method
			checkValidation();
			break;

		case R.id.already_user:

			// Replace login fragment
			new MainActivity().replaceLoginFragment();
			break;
		}

	}

	// Check Validation Method
	private void checkValidation() {

		// Get all edittext texts
		String getFullName = fullName.getText().toString();
		String getEmailId = emailId.getText().toString();
		String getMobileNumber = mobileNumber.getText().toString();
		String getLocation = location.getText().toString();
		String getPassword = password.getText().toString();
		String getConfirmPassword = confirmPassword.getText().toString();

		// Pattern match for email id
		Pattern p = Pattern.compile(Utils.regEx);
		Matcher m = p.matcher(getEmailId);

		// Check if all strings are null or not
		if (getFullName.equals("") || getFullName.length() == 0
				|| getEmailId.equals("") || getEmailId.length() == 0
				|| getMobileNumber.equals("") || getMobileNumber.length() == 0
				|| getLocation.equals("") || getLocation.length() == 0
				|| getPassword.equals("") || getPassword.length() == 0
				|| getConfirmPassword.equals("")
				|| getConfirmPassword.length() == 0)

			new CustomToast().Show_Toast(getActivity(), view,
					"All fields are required.");

		// Check if email id valid or not
		else if (!m.find())
			new CustomToast().Show_Toast(getActivity(), view,
					"Your Email Id is Invalid.");

		// Check if both password should be equal
		else if (!getConfirmPassword.equals(getPassword))
			new CustomToast().Show_Toast(getActivity(), view,
					"Both password doesn't match.");

		//Check if neither of 'Intern' and 'Job' are ticked.
		else if((!isIntern.isChecked()) && (!isJob.isChecked()))
			new CustomToast().Show_Toast(getActivity(), view,
					"Select at least one from Intern and Job.");
		// Make sure user should check Terms and Conditions checkbox
		else if (!terms_conditions.isChecked())
			new CustomToast().Show_Toast(getActivity(), view,
					"Please select Terms and Conditions.");
		// Else do signup or do your stuff
		/*else
			Toast.makeText(getActivity(), "Do SignUp.", Toast.LENGTH_SHORT)
					.show();*/		//TODO: Implement LoginApi.

		progressBar.setVisibility(View.VISIBLE);
		BodySignUpUser bodySignUpUser = new BodySignUpUser(fullName.getText().toString(),
				emailId.getText().toString(),
				mobileNumber.getText().toString(),
				password.getText().toString(),
				(isIntern.isChecked()?1:0),
				(isJob.isChecked()?1:0),
				location.getText().toString());
		Call<ResponseSignUpUser> call = loginApi.signUpUser(bodySignUpUser);
		call.enqueue(new Callback<ResponseSignUpUser>() {
			@Override
			public void onResponse(Call<ResponseSignUpUser> call, Response<ResponseSignUpUser> response) {
				if(!response.isSuccessful()){
					new CustomToast().Show_Toast(getActivity(), view,
							response.message());
					//Toast.makeText(getContext(), response.message(), Toast.LENGTH_SHORT).show();
					progressBar.setVisibility(View.GONE);
					return;
				}

				ResponseSignUpUser responseSignUpUser = response.body();
				new CustomToast().Show_Toast(getActivity(), view,
						responseSignUpUser.getMessage());
				//Toast.makeText(getContext(), responseSignUpUser.getMessage(), Toast.LENGTH_SHORT).show();
				progressBar.setVisibility(View.GONE);

			}

			@Override
			public void onFailure(Call<ResponseSignUpUser> call, Throwable t) {
				Log.i("Failure", "onFailure: "+t.getMessage());
				new CustomToast().Show_Toast(getActivity(), view,
						"Sign Up Failed. " + t.getLocalizedMessage());
				//Toast.makeText(getContext(), "Sign Up Failed. " + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
				progressBar.setVisibility(View.GONE);
				return;
			}
		});
	}


}
