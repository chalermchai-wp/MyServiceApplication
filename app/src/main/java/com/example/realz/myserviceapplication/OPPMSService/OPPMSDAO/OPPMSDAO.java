package com.example.realz.myserviceapplication.OPPMSService.OPPMSDAO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by realz on 3/17/2017 AD.
 */

public class OPPMSDAO {
    @SerializedName("details")
    public Details details;
    @SerializedName("graphData")
    public ArrayList<GraphData> graphData;
}
