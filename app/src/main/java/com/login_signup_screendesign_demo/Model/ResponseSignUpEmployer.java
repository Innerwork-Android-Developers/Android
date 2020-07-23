package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseSignUpEmployer {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    public ResponseSignUpEmployer(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
