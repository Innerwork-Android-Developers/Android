package com.login_signup_screendesign_demo;

import com.login_signup_screendesign_demo.Model.BodyCreateIntern;
import com.login_signup_screendesign_demo.Model.BodyCreateJob;
import com.login_signup_screendesign_demo.Model.BodyGetApplications;
import com.login_signup_screendesign_demo.Model.BodyGetEmployerJobs;
import com.login_signup_screendesign_demo.Model.BodyGetEmployerProfile;
import com.login_signup_screendesign_demo.Model.BodyGetFreeInterns;
import com.login_signup_screendesign_demo.Model.BodyLoginEmployer;
import com.login_signup_screendesign_demo.Model.BodySendPassword;
import com.login_signup_screendesign_demo.Model.BodySignUpEmployer;
import com.login_signup_screendesign_demo.Model.BodySkillInterest;
import com.login_signup_screendesign_demo.Model.ResponseCreateIntern;
import com.login_signup_screendesign_demo.Model.ResponseCreateJob;
import com.login_signup_screendesign_demo.Model.ResponseGetApplications;
import com.login_signup_screendesign_demo.Model.ResponseGetEmployerJobs;
import com.login_signup_screendesign_demo.Model.ResponseGetEmployerProfile;
import com.login_signup_screendesign_demo.Model.ResponseGetFreeInterns;
import com.login_signup_screendesign_demo.Model.ResponseGetInterests;
import com.login_signup_screendesign_demo.Model.ResponseGetSkills;
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

    @POST("empl_profile")
    Call<ResponseGetEmployerProfile> getEmployerProfile(@Body BodyGetEmployerProfile bodyGetEmployerProfile);

    @POST("empl_get_self_jobs")
    Call<ResponseGetEmployerJobs> getEmployerJobs(@Body BodyGetEmployerJobs bodyGetEmployerJobs);

    @POST("empl_get_interns")
    Call<ResponseGetFreeInterns> getFreeInterns(@Body BodyGetFreeInterns bodyGetFreeInterns);

    @POST("empl_get_applications")
    Call<ResponseGetApplications> getApplications(@Body BodyGetApplications bodyGetApplications);

    @POST("empl_create_job")
    Call<ResponseCreateJob> createJob(@Body BodyCreateJob bodyCreateJob);

    @POST("empl_create_intern")
    Call<ResponseCreateIntern> createIntern(@Body BodyCreateIntern bodyCreateIntern);

    @POST("get_interest_list")
    Call<ResponseGetInterests> getInterests(@Body BodySkillInterest bodySkillInterest);

    @POST("get_skill_list")
    Call<ResponseGetSkills> getSkills(@Body BodySkillInterest bodySkillInterest);
}
