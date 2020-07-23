package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class BodyGetApplications {
    @SerializedName("jobPostId")
    public int jobPostId;

    @SerializedName("type")
    public String type;

    public BodyGetApplications(int jobPostId, String type) {
        this.jobPostId = jobPostId;
        this.type = type;
    }
}
