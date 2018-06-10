package com.example.realz.myserviceapplication.OPPMSService.OPPMSDAO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by realz on 3/17/2017 AD.
 */

public class Details {
    @SerializedName("programName")
    public String programName;
    @SerializedName("projectName")
    public String projectName;
    @SerializedName("dateStart")
    public String dateStart;
    @SerializedName("pspType")
    public String pspType;
    @SerializedName("creator")
    public String creator;
    @SerializedName("success")
    public Boolean success;
    @SerializedName("languages")
    public ArrayList<String> languages;
}
