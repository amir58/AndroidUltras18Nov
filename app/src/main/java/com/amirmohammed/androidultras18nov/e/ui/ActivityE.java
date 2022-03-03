package com.amirmohammed.androidultras18nov.e.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.databinding.ActivityEBinding;
import com.amirmohammed.androidultras18nov.e.models.profile.ProfileResponse;
import com.amirmohammed.androidultras18nov.e.models.register.RegisterResponse;
import com.amirmohammed.androidultras18nov.e.models.update_profile.UpdateProfileRequest;
import com.amirmohammed.androidultras18nov.e.models.update_profile.UpdateProfileResponse;
import com.amirmohammed.androidultras18nov.e.network.RetrofitClientE;
import com.amirmohammed.androidultras18nov.e.ui.fragments.CallsFragment;
import com.amirmohammed.androidultras18nov.e.ui.fragments.ChatsFragment;
import com.amirmohammed.androidultras18nov.e.ui.fragments.StatusFragment;
import com.google.android.material.button.MaterialButton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityE extends AppCompatActivity {
    private static final String TAG = "ActivityE";
    // ViewBinding => no findViewById more
    // Fragments

    ActivityEBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, new ChatsFragment())
                .commit();

        binding.btnChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout, new ChatsFragment())
                        .commit();
            }
        });

        binding.btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout, new StatusFragment())
                        .commit();
            }
        });

        binding.btnCalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout, new CallsFragment())
                        .commit();
            }
        });

    }

    void sharedPreferences(){

        // Local database => Room ( SQLITE )

        // Local database => SharedPreferences ( Key value )
        // key language value ar
        // key apiToken value kfbq7y3g97wwf
        // key theme value light

        SharedPreferences sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE);

        sharedPreferences.edit().putString("language", "ar").apply();

        sharedPreferences.getString("language", "ar");

        sharedPreferences.edit().putString("theme", "dark").apply();

        sharedPreferences.getString("theme", "dark");

        sharedPreferences.edit().putString("apiToken", "9r736t97623r796e326fg").apply();

        String apiToken = sharedPreferences.getString("apiToken", "");

        if (apiToken.isEmpty()){
            // navigate to login activity
        }
        else {
            // navigate to main activity
        }

        sharedPreferences.edit().putString("apiToken", "").apply();
    }

    void apis(){
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