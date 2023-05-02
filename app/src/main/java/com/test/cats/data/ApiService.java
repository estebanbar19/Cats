package com.test.cats.data;

import com.test.cats.models.Cat;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService {
    String API_KEY = "bda53789-d59e-46cd-9bc4-2936630fde39";

    @Headers("x-api-key:"+API_KEY)
    @GET("/v1/breeds")
    Call<List<Cat>> getCats();
}
