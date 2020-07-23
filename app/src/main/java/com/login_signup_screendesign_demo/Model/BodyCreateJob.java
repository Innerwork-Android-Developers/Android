package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BodyCreateJob {

    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;
    @SerializedName("company")
    @Expose
    public String company;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("jobType")
    @Expose
    public String jobType;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("minSalary")
    @Expose
    public String minSalary;
    @SerializedName("maxSalary")
    @Expose
    public String maxSalary;
    @SerializedName("cpname")
    @Expose
    public String cpname;
    @SerializedName("cpnum")
    @Expose
    public String cpnum;
    @SerializedName("exp")
    @Expose
    public String exp;
    @SerializedName("education")
    @Expose
    public String education;
    @SerializedName("j_desc")
    @Expose
    public String jDesc;
    @SerializedName("about_comp")
    @Expose
    public String aboutComp;
    @SerializedName("skills")
    @Expose
    public String skills;
    @SerializedName("agency_id")
    @Expose
    public int agencyId;

    /**
     * No args constructor for use in serialization
     *
     */
    public BodyCreateJob() {
    }

    /**
     *
     * @param maxSalary
     * @param aboutComp
     * @param education
     * @param jobTitle
     * @param agencyId
     * @param minSalary
     * @param jDesc
     * @param skills
     * @param cpname
     * @param company
     * @param location
     * @param jobType
     * @param exp
     * @param email
     * @param cpnum
     */
    public BodyCreateJob(String jobTitle, String company, String email, String jobType, String location, String minSalary, String maxSalary, String cpname, String cpnum, String exp, String education, String jDesc, String aboutComp, String skills, int agencyId) {
        super();
        this.jobTitle = jobTitle;
        this.company = company;
        this.email = email;
        this.jobType = jobType;
        this.location = location;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.cpname = cpname;
        this.cpnum = cpnum;
        this.exp = exp;
        this.education = education;
        this.jDesc = jDesc;
        this.aboutComp = aboutComp;
        this.skills = skills;
        this.agencyId = agencyId;
    }

}