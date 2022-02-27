package com.amirmohammed.androidultras18nov.ui.news;

import com.amirmohammed.androidultras18nov.models.gen.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apis {
    // https://newsapi.org/v2/top-headlines?country=eg&category=business&apiKey=fa72aea7f1af46a6a45be8aa23e21b64
    // baseUrl : https://newsapi.org/
    // endPoint : v2/top-headlines
    // queryParameters : ?country=eg&category=business&apiKey=fa72aea7f1af46a6a45be8aa23e21b64

//    @GET("v2/top-headlines?country=eg&category=business&apiKey=fa72aea7f1af46a6a45be8aa23e21b64")
//    Call<NewsResponse> getNews();
//
//    @GET("v2/top-headlines?country=eg&category=sports&apiKey=fa72aea7f1af46a6a45be8aa23e21b64")
//    Call<NewsResponse> getSportsNews();

    @GET("v2/top-headlines?apiKey=fa72aea7f1af46a6a45be8aa23e21b64")
    Call<NewsResponse> getNews(
            @Query("country") String country,
            @Query("category") String category
    );

//      @GET("v2/top-headlines")
//    Call<NewsResponse> getNews(
//            @Query("country") String country,
//            @Query("category") String category,
//            @Query("apiKey") String apiKey
//    );


}
