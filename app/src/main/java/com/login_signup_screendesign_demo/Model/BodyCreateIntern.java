package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BodyCreateIntern {

    @SerializedName("intTitle")
    @Expose
    public String intTitle;
    @SerializedName("company")
    @Expose
    public String company;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("maxSalary")
    @Expose
    public String maxSalary;
    @SerializedName("cpname")
    @Expose
    public String cpname;
    @SerializedName("cpnum")
    @Expose
    public String cpnum;
    @SerializedName("j_desc")
    @Expose
    public String jDesc;
    @SerializedName("exp")
    @Expose
    public String exp;
    @SerializedName("education")
    @Expose
    public String education;
    @SerializedName("about_comp")
    @Expose
    public String aboutComp;
    @SerializedName("agency_id")
    @Expose
    public int agencyId;

    /**
     * No args constructor for use in serialization
     *
     */
    public BodyCreateIntern() {
    }

    /**
     *
     * @param maxSalary
     * @param aboutComp
     * @param education
     * @param intTitle
     * @param cpname
     * @param company
     * @param agencyId
     * @param exp
     * @param jDesc
     * @param email
     * @param cpnum
     */
    public BodyCreateIntern(String intTitle, String company, String email, String maxSalary, String cpname, String cpnum, String jDesc, String exp, String education, String aboutComp, int agencyId) {
        super();
        this.intTitle = intTitle;
        this.company = company;
        this.email = email;
        this.maxSalary = maxSalary;
        this.cpname = cpname;
        this.cpnum = cpnum;
        this.jDesc = jDesc;
        this.exp = exp;
        this.education = education;
        this.aboutComp = aboutComp;
        this.agencyId = agencyId;
    }

}