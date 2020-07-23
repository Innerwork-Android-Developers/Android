package com.login_signup_screendesign_demo.Model;

import android.content.Intent;

import com.google.gson.annotations.SerializedName;

public class BodyGetUserProfile {

    @SerializedName("userId")
    public Integer userId;

    public BodyGetUserProfile(Integer userId) {
        this.userId = userId;
    }
}
