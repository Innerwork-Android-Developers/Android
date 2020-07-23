package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseGetUserApplications {

    @SerializedName("code")
    public int code;

    @SerializedName("message")
    public String message;

    @SerializedName("jobposts")
    public ArrayList<JobPost> jobposts;

}
