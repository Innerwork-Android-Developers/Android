package com.login_signup_screendesign_demo.Model;

import com.google.gson.annotations.SerializedName;

public class BodySignUpEmployer {
    @SerializedName("companyname")
    public String companyname;

    @SerializedName("website")
    public String website;

    @SerializedName("mobile")
    public long mobile;

    @SerializedName("address")
    public String address;

    @SerializedName("state")
    public String state;

    @SerializedName("city")
    public String city;

    @SerializedName("postcode")
    public int postcode;

    @SerializedName("contactperson")
    public String contactperson;

    @SerializedName("email")
    public String email;

    @SerializedName("password")
    public String password;

    @SerializedName("noofstaffs")
    public String noofstaffs;

    @SerializedName("noofoffices")
    public String noofoffices;

    @SerializedName("noofplacements")
    public String noofplacements;

    @SerializedName("comment")
    public String comment;

    @SerializedName("sector")
    public String sector;

    @SerializedName("experience")
    public int experience;

    @SerializedName("keyword")
    public String keyword;

    public BodySignUpEmployer(String companyname, String website, long mobile, String address, String state, String city, int postcode, String contactperson, String email, String password, String noofstaffs, String noofoffices, String noofplacements, String comment, String sector, int experience, String keyword) {
        this.companyname = companyname;
        this.website = website;
        this.mobile = mobile;
        this.address = address;
        this.state = state;
        this.city = city;
        this.postcode = postcode;
        this.contactperson = contactperson;
        this.email = email;
        this.password = password;
        this.noofstaffs = noofstaffs;
        this.noofoffices = noofoffices;
        this.noofplacements = noofplacements;
        this.comment = comment;
        this.sector = sector;
        this.experience = experience;
        this.keyword = keyword;
    }
}
