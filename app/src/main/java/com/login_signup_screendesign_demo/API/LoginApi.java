package com.login_signup_screendesign_demo.API;

import com.login_signup_screendesign_demo.Model.BodyLoginUser;
import com.login_signup_screendesign_demo.Model.BodySendPassword;
import com.login_signup_screendesign_demo.Model.BodySignUpUser;
import com.login_signup_screendesign_demo.Model.ResponseLoginUser;
import com.login_signup_screendesign_demo.Model.ResponseSendPassword;
import com.login_signup_screendesign_demo.Model.ResponseSignUpUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {
    @POST("sign_up_user.php")
    Call<ResponseSignUpUser> signUpUser(@Body BodySignUpUser bodySignUpUser);

    @POST("log_in_user.php")
    Call<ResponseLoginUser> logInUser(@Body BodyLoginUser bodyLoginUser);

    @POST("send_password")
    Call<ResponseSendPassword> sendPassword(@Body BodySendPassword bodySendPassword);
}
