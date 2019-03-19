package com.example.applications;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIServices
{@FormUrlEncoded
@POST("Prospect")
Call<example> userSignUp(@Field("user_id") Integer user_id,
                         @Field("name") String name,
                         @Field("phoneno") String phoneno,
                         @Field("emailid") String email,
                         @Field("college") String college,
                         @Field("source") String source ,
                         @Field("course") String course,
                         @Field("status") String status,
                         @Field("reg_date") String reg_date,
                         @Field("comment") String comment);

@GET("GetProspects")
Call<example> userDisplay();


}
