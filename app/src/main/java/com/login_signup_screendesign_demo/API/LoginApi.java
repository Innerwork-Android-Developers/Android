package com.login_signup_screendesign_demo.API;

import com.login_signup_screendesign_demo.Model.BodyApplyIntern;
import com.login_signup_screendesign_demo.Model.BodyApplyJob;
import com.login_signup_screendesign_demo.Model.BodyGetJobs;
import com.login_signup_screendesign_demo.Model.BodyGetUserApplications;
import com.login_signup_screendesign_demo.Model.BodyGetUserProfile;
import com.login_signup_screendesign_demo.Model.BodyLoginUser;
import com.login_signup_screendesign_demo.Model.BodySendPassword;
import com.login_signup_screendesign_demo.Model.BodySignUpUser;
import com.login_signup_screendesign_demo.Model.ResponseApplyIntern;
import com.login_signup_screendesign_demo.Model.ResponseApplyJob;
import com.login_signup_screendesign_demo.Model.ResponseGetJobs;
import com.login_signup_screendesign_demo.Model.ResponseGetUserApplications;
import com.login_signup_screendesign_demo.Model.ResponseGetUserProfile;
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

    @POST("user_profile")
    Call<ResponseGetUserProfile> getUserProfile(@Body BodyGetUserProfile bodyGetUserProfile);

    @POST("user_get_jobs")
    Call<ResponseGetJobs> getJobs(@Body BodyGetJobs bodyGetJobs);

    @POST("user_get_applications")
    Call<ResponseGetUserApplications> getUserApplications(@Body BodyGetUserApplications bodyGetUserApplications);

    @POST("user_apply_job")
    Call<ResponseApplyJob> applyJob(@Body BodyApplyJob bodyApplyJob);

    @POST("user_apply_intern")
    Call<ResponseApplyIntern> applyIntern(@Body BodyApplyIntern bodyApplyIntern);
}
