package com.login_signup_screendesign_demo.Model;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseGetApplications {

    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("applications")
    @Expose
    public ArrayList<Application> applications = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseGetApplications() {
    }

    /**
     *
     * @param code
     * @param message
     * @param applications
     */
    public ResponseGetApplications(int code, String message, ArrayList<Application> applications) {
        super();
        this.code = code;
        this.message = message;
        this.applications = applications;
    }

    public class Application {

        @SerializedName("id")
        @Expose
        public String id;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("gender")
        @Expose
        public String gender;
        @SerializedName("city")
        @Expose
        public String city;
        @SerializedName("education")
        @Expose
        public String education;
        @SerializedName("phone")
        @Expose
        public String phone;
        @SerializedName("exp")
        @Expose
        public String exp;
        @SerializedName("skill")
        @Expose
        public String skill;
        @SerializedName("interest")
        @Expose
        public String interest;
        @SerializedName("jobpost_id")
        @Expose
        public String jobpostId;
        @SerializedName("user_id")
        @Expose
        public String userId;

        /**
         * No args constructor for use in serialization
         *
         */
        public Application() {
        }

        /**
         *
         * @param education
         * @param gender
         * @param jobpostId
         * @param city
         * @param phone
         * @param interest
         * @param skill
         * @param name
         * @param id
         * @param exp
         * @param userId
         * @param email
         */
        public Application(String id, String name, String email, String gender, String city, String education, String phone, String exp, String skill, String interest, String jobpostId, String userId) {
            super();
            this.id = id;
            this.name = name;
            this.email = email;
            this.gender = gender;
            this.city = city;
            this.education = education;
            this.phone = phone;
            this.exp = exp;
            this.skill = skill;
            this.interest = interest;
            this.jobpostId = jobpostId;
            this.userId = userId;
        }

    }
}