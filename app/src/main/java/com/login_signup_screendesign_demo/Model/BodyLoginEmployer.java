package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class BodyLoginEmployer {
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;

    public BodyLoginEmployer(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
