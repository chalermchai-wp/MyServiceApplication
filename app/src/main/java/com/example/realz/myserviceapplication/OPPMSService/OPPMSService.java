package com.example.realz.myserviceapplication.OPPMSService;

import com.example.realz.myserviceapplication.OPPMSService.OPPMSDAO.OPPMSDAO;
import com.example.realz.myserviceapplication.OPPMSService.OPPMSDAO.SendQuick;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by realz on 3/17/2017 AD.
 */
public interface OPPMSService {

    @POST("index.php/OPPMS/service_android/graph_cycle")
    Call<OPPMSDAO> getOPPMSData();

    @FormUrlEncoded

    @POST("index.php/OPPMS/service_android/send_quick")
    Call<SendQuick> sendData(@Field("id") String id, @Field("name") String name);
}