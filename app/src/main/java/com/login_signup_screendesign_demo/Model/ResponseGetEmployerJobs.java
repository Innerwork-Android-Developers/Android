package com.login_signup_screendesign_demo.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseGetEmployerJobs {

    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("jobposts")
    @Expose
    public List<Jobpost> jobposts = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseGetEmployerJobs() {
    }

    /**
     *
     * @param code
     * @param message
     * @param jobposts
     */
    public ResponseGetEmployerJobs(int code, String message, List<Jobpost> jobposts) {
        super();
        this.code = code;
        this.message = message;
        this.jobposts = jobposts;
    }

}