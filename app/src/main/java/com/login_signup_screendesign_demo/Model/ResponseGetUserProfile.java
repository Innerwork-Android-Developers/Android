package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseGetUserProfile {

    @SerializedName("userId")
    public String userId;

    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    @SerializedName("phone")
    public String phone;

    @SerializedName("location")
    public String location;

    @SerializedName("isIntern")
    public Boolean isIntern;

    @SerializedName("isJob")
    public Boolean isJob;

    public ResponseGetUserProfile(String userId, String name, String email, String phone, String location, Boolean isIntern, Boolean isJob) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.isIntern = isIntern;
        this.isJob = isJob;
    }
}
