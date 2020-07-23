package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseApplyIntern {

    @SerializedName("code")
    public int code;

    @SerializedName("message")
    public String message;

    public ResponseApplyIntern(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
