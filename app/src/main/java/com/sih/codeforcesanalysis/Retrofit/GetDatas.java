package com.sih.codeforcesanalysis.Retrofit;

import com.sih.codeforcesanalysis.Classes.User;
import com.sih.codeforcesanalysis.Classes.getUserHelperClass;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetDatas {

    @GET("/api/user.info")
    Call<getUserHelperClass> getUserHelperClass(@Query("handles")  String handles );
}
