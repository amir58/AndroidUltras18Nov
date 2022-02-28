package com.amirmohammed.androidultras18nov.e.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.e.models.profile.ProfileResponse;
import com.amirmohammed.androidultras18nov.e.models.register.RegisterResponse;
import com.amirmohammed.androidultras18nov.e.models.update_profile.UpdateProfileRequest;
import com.amirmohammed.androidultras18nov.e.models.update_profile.UpdateProfileResponse;
import com.amirmohammed.androidultras18nov.e.network.RetrofitClientE;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityE extends AppCompatActivity {
    private static final String TAG = "ActivityE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        RetrofitClientE.getApi().getProfileData("L2J0cFgWjKjQ2MrSM9YNDbMbGICD0rZP9SN4muaSlB91QYvVtEhPlNLnrepwhcXs7SB0PF")
                .enqueue(new Callback<ProfileResponse>() {
                    @Override
                    public void onResponse(Call<ProfileResponse> call, Response<ProfileResponse> response) {
                        if (response.isSuccessful()) {
                            if (response.body().isStatus()) {
                                Log.i(TAG, "onResponse: " + response.body().getData().getEmail());

                            } else {
                                Log.i(TAG, "onResponse: " + response.body().getMessage());
                            }
                        }
                        else{
                            Log.i(TAG, "onResponse: " + response.code());
                        }
                    }

                    @Override
                    public void onFailure(Call<ProfileResponse> call, Throwable t) {
                        Log.i(TAG, "onFailure: " + t.getLocalizedMessage());
                    }
                });


        UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest(
                "","","",""
        );

        RetrofitClientE.getApi().updateProfile(
                "token",
                updateProfileRequest
        ).enqueue(new Callback<UpdateProfileResponse>() {
            @Override
            public void onResponse(Call<UpdateProfileResponse> call, Response<UpdateProfileResponse> response) {

            }

            @Override
            public void onFailure(Call<UpdateProfileResponse> call, Throwable t) {

            }
        });

//        RetrofitClientE.getApi().register(
//                "ar",
//                "name",
//                "phone",
//                "password",
//                "email"
//        ).enqueue(new Callback<RegisterResponse>() {
//            @Override
//            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
//                if (response.isSuccessful()){
//                    if (response.body().isStatus()){
//
//                    }
//                    else{
//
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<RegisterResponse> call, Throwable t) {
//
//            }
//        });
    }
}