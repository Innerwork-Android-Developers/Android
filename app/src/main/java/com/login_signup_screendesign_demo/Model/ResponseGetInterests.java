package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseGetInterests {

    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("interests")
    @Expose
    public List<Interest> interests = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseGetInterests() {
    }

    /**
     *
     * @param code
     * @param message
     * @param interests
     */
    public ResponseGetInterests(int code, String message, List<Interest> interests) {
        super();
        this.code = code;
        this.message = message;
        this.interests = interests;
    }
    public static class Interest {

        @SerializedName("interest_id")
        @Expose
        public String interestId;
        @SerializedName("interest_name")
        @Expose
        public String interestName;

        /**
         * No args constructor for use in serialization
         *
         */
        public Interest() {
        }

        /**
         *
         * @param interestId
         * @param interestName
         */
        public Interest(String interestId, String interestName) {
            super();
            this.interestId = interestId;
            this.interestName = interestName;
        }

    }
}