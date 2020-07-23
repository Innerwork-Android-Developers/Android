package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseGetEmployerProfile {

    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("profile")
    @Expose
    public Profile profile;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseGetEmployerProfile() {
    }

    /**
     *
     * @param code
     * @param profile
     * @param message
     */
    public ResponseGetEmployerProfile(int code, String message, Profile profile) {
        super();
        this.code = code;
        this.message = message;
        this.profile = profile;
    }

    public static class Profile {

        @SerializedName("userId")
        @Expose
        public String userId;
        @SerializedName("companyname")
        @Expose
        public String companyname;
        @SerializedName("website")
        @Expose
        public String website;
        @SerializedName("mobile")
        @Expose
        public String mobile;
        @SerializedName("address")
        @Expose
        public String address;
        @SerializedName("city")
        @Expose
        public String city;
        @SerializedName("state")
        @Expose
        public String state;
        @SerializedName("postcode")
        @Expose
        public String postcode;
        @SerializedName("contactperson")
        @Expose
        public String contactperson;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("noofstaffs")
        @Expose
        public String noofstaffs;
        @SerializedName("noofoffices")
        @Expose
        public String noofoffices;
        @SerializedName("noofplacements")
        @Expose
        public String noofplacements;
        @SerializedName("comment")
        @Expose
        public String comment;
        @SerializedName("sector")
        @Expose
        public String sector;
        @SerializedName("experience")
        @Expose
        public String experience;
        @SerializedName("keyword")
        @Expose
        public String keyword;
        @SerializedName("image")
        @Expose
        public String image;
        @SerializedName("adhar")
        @Expose
        public String adhar;
        @SerializedName("pan")
        @Expose
        public String pan;
        @SerializedName("cv")
        @Expose
        public String cv;
        @SerializedName("status")
        @Expose
        public String status;

        /**
         * No args constructor for use in serialization
         *
         */
        public Profile() {
        }

        /**
         *
         * @param noofplacements
         * @param image
         * @param website
         * @param contactperson
         * @param address
         * @param city
         * @param mobile
         * @param postcode
         * @param experience
         * @param userId
         * @param noofstaffs
         * @param noofoffices
         * @param adhar
         * @param cv
         * @param companyname
         * @param comment
         * @param state
         * @param keyword
         * @param pan
         * @param sector
         * @param email
         * @param status
         */
        public Profile(String userId, String companyname, String website, String mobile, String address, String city, String state, String postcode, String contactperson, String email, String noofstaffs, String noofoffices, String noofplacements, String comment, String sector, String experience, String keyword, String image, String adhar, String pan, String cv, String status) {
            super();
            this.userId = userId;
            this.companyname = companyname;
            this.website = website;
            this.mobile = mobile;
            this.address = address;
            this.city = city;
            this.state = state;
            this.postcode = postcode;
            this.contactperson = contactperson;
            this.email = email;
            this.noofstaffs = noofstaffs;
            this.noofoffices = noofoffices;
            this.noofplacements = noofplacements;
            this.comment = comment;
            this.sector = sector;
            this.experience = experience;
            this.keyword = keyword;
            this.image = image;
            this.adhar = adhar;
            this.pan = pan;
            this.cv = cv;
            this.status = status;
        }

    }
}