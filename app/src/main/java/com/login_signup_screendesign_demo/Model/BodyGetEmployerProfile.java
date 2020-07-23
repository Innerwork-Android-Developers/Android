package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class BodyGetEmployerProfile {

    @SerializedName("userId")
    public int userId;

    public BodyGetEmployerProfile(int userId) {
        this.userId = userId;
    }
}
