package com.example.vasuchand.lbb_retrofit;

import android.support.v7.util.SortedList;

import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Vasu Chand on 5/5/2017.
 */

public interface Apiinterface {

    @Headers(

                   // "Name: authorization",
                    //"Value: HarshTestAuthKey"
                    "authorization: HarshTestAuthKey"

    )
    @GET("/testapi")
    Call<name> getBooks();
    @GET("/testapi")
    Call<model> getidsplusgetaddress();

}
