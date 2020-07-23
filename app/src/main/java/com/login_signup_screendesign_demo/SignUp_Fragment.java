package com.login_signup_screendesign_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
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
import android.widget.TextView;
import android.widget.Toast;

import com.login_signup_screendesign_demo.Model.BodySignUpEmployer;
import com.login_signup_screendesign_demo.Model.ResponseSignUpEmployer;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUp_Fragment extends Fragment implements OnClickListener {
	private static View view;
	private static EditText fullName, emailId, mobileNumber,
			password, confirmPassword,CompanyName,Website,CompanyAddress,Pincode,keywordsegITnonITHR ,ContactPersonName,City,State,Experience,NoOfStaff,NoOfOffices,ApproaxNoOfPlacemnet,editText, sector;
	private static TextView login,Aboutus,NatureOfBusiness;
	private static Button signUpButton,radiobutton1,radiobutton2,radiobutton3;
	private static CheckBox terms_conditions;

	Retrofit retrofit;
	LoginApi loginApi;

	public SignUp_Fragment() {

	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.signup_layout, container, false);
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
		// set your desired log level
		logging.setLevel(HttpLoggingInterceptor.Level.BODY);

		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		// add your other interceptors …

		// add logging as last interceptor
		httpClient.addInterceptor(logging);  // <-- this is the important line!

		retrofit = new Retrofit.Builder()
				.baseUrl("https://www.innerworkindia.com/")
				.addConverterFactory(GsonConverterFactory.create())
				.client(httpClient.build())
				.build();
		loginApi = retrofit.create(LoginApi.class);

		initViews();
		setListeners();
		return view;
	}

	// Initialize all views
	private void initViews() {
		CompanyName= (EditText) view.findViewById(R.id.CompanyName);
		fullName = (EditText) view.findViewById(R.id.fullName);
		Website = (EditText) view.findViewById(R.id.Website);
		emailId = (EditText) view.findViewById(R.id.userEmailId);
		mobileNumber = (EditText) view.findViewById(R.id.mobileNumber);
		CompanyAddress = (EditText) view.findViewById(R.id.location);
		Pincode = (EditText) view.findViewById(R.id.code);
		City = (EditText) view.findViewById(R.id.city);
		State = (EditText) view.findViewById(R.id.state);
		Experience = (EditText) view.findViewById(R.id.experience);
		keywordsegITnonITHR = (EditText) view.findViewById(R.id.keyword);
		ContactPersonName = (EditText) view.findViewById(R.id.Name);
		password = (EditText) view.findViewById(R.id.password);
		confirmPassword = (EditText) view.findViewById(R.id.confirmPassword);
		Aboutus = (TextView) view.findViewById(R.id.textView);
		editText = (EditText) view.findViewById(R.id.editText);
		sector = (EditText) view.findViewById(R.id.sector);
		NatureOfBusiness = (TextView) view.findViewById(R.id.textView2);
		radiobutton1= (Button) view.findViewById(R.id.radioButton1);
		radiobutton2= (Button) view.findViewById(R.id.radioButton2);
		radiobutton3= (Button) view.findViewById(R.id.radioButton3);
		NoOfStaff = (EditText) view.findViewById(R.id.staff);
		NoOfOffices = (EditText) view.findViewById(R.id.office);
		ApproaxNoOfPlacemnet= (EditText) view.findViewById(R.id.placement);
		signUpButton = (Button) view.findViewById(R.id.signUpBtn);
		login = (TextView) view.findViewById(R.id.already_user);
		terms_conditions = (CheckBox) view.findViewById(R.id.terms_conditions);

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
		String getCompanyName = CompanyName.getText().toString();
		String getFullName = fullName.getText().toString();
		String getWebsite = Website.getText().toString();
		String getEmailId = emailId.getText().toString();
		String getMobileNumber = mobileNumber.getText().toString();
		String getLocation = CompanyAddress.getText().toString();
		String getCode = Pincode.getText().toString();
		String getcity = City.getText().toString();
		String getstate = State.getText().toString();
		String getexperience = Experience.getText().toString();
		String getKeyword = keywordsegITnonITHR.getText().toString();
		String getName = ContactPersonName.getText().toString();
		String getPassword = password.getText().toString();
		String getConfirmPassword = confirmPassword.getText().toString();
		String getstaff= NoOfStaff.getText().toString();
		String getoffice = NoOfOffices.getText().toString();
		String getplacement = ApproaxNoOfPlacemnet.getText().toString();
		String geteditText = editText.getText().toString();
		String getSector = sector.getText().toString();

		// Pattern match for email id
		Pattern p = Pattern.compile(Utils.regEx);
		Matcher m = p.matcher(getEmailId);

		// Check if all strings are null or not
		if
		(
				getCompanyName.equals("") || getCompanyName.length() == 0
		        || getFullName.equals("") || getFullName.length() == 0 || getWebsite.equals("") || getWebsite.length() == 0
				|| getEmailId.equals("") || getEmailId.length() == 0
				|| getMobileNumber.equals("") || getMobileNumber.length() == 0
				|| getLocation.equals("") || getLocation.length() == 0 || getCode.equals("") || getCode.length() == 0 || getKeyword.equals("") || getKeyword.length() == 0 || getName.equals("") || getName.length() == 0
				|| getPassword.equals("") || getPassword.length() == 0
						|| getcity.equals("") || getcity.length()==0
						|| getstate.equals("") || getstate.length() == 0
						|| getexperience.equals("") || getexperience.length() == 0
						|| geteditText.equals("") || geteditText.length() == 0
				||getSector.equals("")||getSector.length()==0
				|| getConfirmPassword.equals("")
				|| getConfirmPassword.length() == 0 || getstaff.equals("") || getstaff.length() == 0 || getoffice.equals("") || getoffice.length() == 0 || getplacement.equals("") || getplacement.length() == 0)

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

		// Make sure user should check Terms and Conditions checkbox
		else if (!terms_conditions.isChecked())
			new CustomToast().Show_Toast(getActivity(), view,
					"Please select Terms and Conditions.");

		// Else do signup or do your stuff
		else{
			BodySignUpEmployer bodySignUpEmployer = new BodySignUpEmployer(
					getCompanyName,
					getWebsite,
					Long.parseLong(getMobileNumber),
					getLocation,
					getstate,
					getcity,
					Integer.parseInt(getCode),
					getName,
					getEmailId,
					getPassword,
					getstaff,
					getoffice,
					getplacement,
					geteditText,
					getSector,
					Integer.parseInt(getexperience),
					getKeyword
			);
			Call<ResponseSignUpEmployer> call = loginApi.signUpUser(bodySignUpEmployer);
			call.enqueue(new Callback<ResponseSignUpEmployer>() {
				@Override
				public void onResponse(Call<ResponseSignUpEmployer> call, Response<ResponseSignUpEmployer> response) {
					if(!response.isSuccessful()){
						new CustomToast().Show_Toast(getActivity(), view,
								response.message());
						//Toast.makeText(getContext(), response.message(), Toast.LENGTH_SHORT).show();
						return;
					}

					ResponseSignUpEmployer ResponseSignUpEmployer = response.body();
					new CustomToast().Show_Toast(getActivity(), view,
							ResponseSignUpEmployer.getMessage());
					//Toast.makeText(getContext(), ResponseSignUpEmployer.getMessage(), Toast.LENGTH_SHORT).show();

				}

				@Override
				public void onFailure(Call<ResponseSignUpEmployer> call, Throwable t) {
					Log.i("Failure", "onFailure: "+t.getMessage());
					new CustomToast().Show_Toast(getActivity(), view,
							"Sign Up Failed. " + t.getLocalizedMessage());
					//Toast.makeText(getContext(), "Sign Up Failed. " + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
					return;
				}
			});
		}

	}
}
