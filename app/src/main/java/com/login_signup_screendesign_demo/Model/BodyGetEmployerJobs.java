package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class BodyGetEmployerJobs {

    @SerializedName("emplId")
    public String emplId;

    public BodyGetEmployerJobs(String emplId) {
        this.emplId = emplId;
    }
}
