package com.amirmohammed.androidultras18nov.e.network;

import com.amirmohammed.androidultras18nov.e.models.favourites.delete.DeleteFavoriteResponse;
import com.amirmohammed.androidultras18nov.e.models.login.LoginResponse;
import com.amirmohammed.androidultras18nov.e.models.profile.ProfileResponse;
import com.amirmohammed.androidultras18nov.e.models.register.RegisterRequest;
import com.amirmohammed.androidultras18nov.e.models.register.RegisterResponse;
import com.amirmohammed.androidultras18nov.e.models.update_profile.UpdateProfileRequest;
import com.amirmohammed.androidultras18nov.e.models.update_profile.UpdateProfileResponse;
import com.amirmohammed.androidultras18nov.models.gen.NewsResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApisE {

    @FormUrlEncoded
    @POST("register")
    Call<RegisterResponse> register(
            @Header("lang") String lang,
            @Field("name") String name,
            @Field("phone") String phone,
            @Field("password") String password,
            @Field("email") String email
    );


    @POST("register")
    Call<RegisterResponse> register(
            @Body RegisterRequest registerRequest
    );

    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("profile")
    Call<ProfileResponse> getProfileData(
            @Header("Authorization") String token
    );


    @PUT("update-profile")
    Call<UpdateProfileResponse> updateProfile(
            @Header("Authorization") String token,
            @Body UpdateProfileRequest updateProfileRequest
    );

    @DELETE("favorites/{favoriteId}")
    Call<DeleteFavoriteResponse> deleteFavorite(
            @Path("favoriteId") String favoriteId,
            @Header("Authorization") String token
    );

}
