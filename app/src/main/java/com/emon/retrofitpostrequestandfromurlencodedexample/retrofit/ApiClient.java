package com.emon.retrofitpostrequestandfromurlencodedexample.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BaseUrl="https://jsonplaceholder.typicode.com/";
    private static Retrofit retrofit=null;

    public static Retrofit getClient(){
        if (retrofit == null) {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
