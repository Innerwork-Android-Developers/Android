package com.login_signup_screendesign_demo;

import com.login_signup_screendesign_demo.Model.BodyLoginEmployer;
import com.login_signup_screendesign_demo.Model.BodySendPassword;
import com.login_signup_screendesign_demo.Model.BodySignUpEmployer;
import com.login_signup_screendesign_demo.Model.ResponseLoginEmployer;
import com.login_signup_screendesign_demo.Model.ResponseSendPassword;
import com.login_signup_screendesign_demo.Model.ResponseSignUpEmployer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {
    @POST("empl_sign_up.php")
    Call<ResponseSignUpEmployer> signUpUser(@Body BodySignUpEmployer bodySignUpEmployer);

    @POST("empl_log_in.php")
    Call<ResponseLoginEmployer> logInUser(@Body BodyLoginEmployer bodyLoginEmployer);

    @POST("empl_send_password")
    Call<ResponseSendPassword> sendPassword(@Body BodySendPassword bodySendPassword);
}
