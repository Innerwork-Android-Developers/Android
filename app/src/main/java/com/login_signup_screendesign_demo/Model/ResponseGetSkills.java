package com.login_signup_screendesign_demo.Model;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseGetSkills {

    @SerializedName("code")
    @Expose
    public int code;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("skills")
    @Expose
    public ArrayList<Skill> skills = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseGetSkills() {
    }

    /**
     *
     * @param skills
     * @param code
     * @param message
     */
    public ResponseGetSkills(int code, String message, ArrayList<Skill> skills) {
        super();
        this.code = code;
        this.message = message;
        this.skills = skills;
    }

    public class Skill {

        @SerializedName("skill_id")
        @Expose
        public String skillId;
        @SerializedName("skill_name")
        @Expose
        public String skillName;

        /**
         * No args constructor for use in serialization
         *
         */
        public Skill() {
        }

        /**
         *
         * @param skillName
         * @param skillId
         */
        public Skill(String skillId, String skillName) {
            super();
            this.skillId = skillId;
            this.skillName = skillName;
        }

    }
}