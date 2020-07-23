package com.login_signup_screendesign_demo.Model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseGetFreeInterns {

    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("uniqueSkill")
    @Expose
    public List<String> uniqueSkill = null;
    @SerializedName("candidates")
    @Expose
    public ArrayList<Candidate> candidates = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseGetFreeInterns() {
    }

    /**
     *
     * @param uniqueSkill
     * @param candidates
     * @param code
     * @param message
     */
    public ResponseGetFreeInterns(int code, String message, List<String> uniqueSkill, ArrayList<Candidate> candidates) {
        super();
        this.code = code;
        this.message = message;
        this.uniqueSkill = uniqueSkill;
        this.candidates = candidates;
    }

    public static class Candidate {

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
        public Candidate() {
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
        public Candidate(String id, String name, String email, String gender, String city, String education, String phone, String exp, String skill, String interest, String jobpostId, String userId) {
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