package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobPost {

    @SerializedName("id")
    @Expose
    public String id;
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
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("exp")
    @Expose
    public String exp;
    @SerializedName("education")
    @Expose
    public String education;
    @SerializedName("j_desc")
    @Expose
    public String jDesc;
    @SerializedName("dateTime")
    @Expose
    public String dateTime;
    @SerializedName("job_referalamt")
    @Expose
    public int jobReferalamt;
    @SerializedName("about_comp")
    @Expose
    public String aboutComp;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("skills")
    @Expose
    public String skills;
    @SerializedName("idesc")
    @Expose
    public String idesc;
    @SerializedName("agency_id")
    @Expose
    public String agencyId;

    /**
     * No args constructor for use in serialization
     *
     */
    public JobPost() {
    }

    /**
     *
     * @param dateTime
     * @param maxSalary
     * @param aboutComp
     * @param education
     * @param jobReferalamt
     * @param jobTitle
     * @param agencyId
     * @param minSalary
     * @param type
     * @param idesc
     * @param jDesc
     * @param skills
     * @param cpname
     * @param company
     * @param location
     * @param id
     * @param jobType
     * @param exp
     * @param email
     * @param cpnum
     * @param status
     */
    public JobPost(String id, String jobTitle, String company, String email, String jobType, String location, String minSalary, String maxSalary, String cpname, String cpnum, String status, String exp, String education, String jDesc, String dateTime, int jobReferalamt, String aboutComp, String type, String skills, String idesc, String agencyId) {
        super();
        this.id = id;
        this.jobTitle = jobTitle;
        this.company = company;
        this.email = email;
        this.jobType = jobType;
        this.location = location;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.cpname = cpname;
        this.cpnum = cpnum;
        this.status = status;
        this.exp = exp;
        this.education = education;
        this.jDesc = jDesc;
        this.dateTime = dateTime;
        this.jobReferalamt = jobReferalamt;
        this.aboutComp = aboutComp;
        this.type = type;
        this.skills = skills;
        this.idesc = idesc;
        this.agencyId = agencyId;
    }

}