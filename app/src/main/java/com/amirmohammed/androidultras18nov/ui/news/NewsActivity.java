package com.amirmohammed.androidultras18nov.ui.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.gen.ArticlesItem;
import com.amirmohammed.androidultras18nov.models.gen.NewsResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsActivity extends AppCompatActivity {
    private static final String TAG = "News";
    private List<ArticlesItem> news = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        Apis apis = retrofit.create(Apis.class);

        apis.getNews().enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){

                    Log.i(TAG, "onResponse: " + response.body().getArticles().size());
                    Log.i(TAG, "onResponse: " + response.body().toString());

                    news = response.body().getArticles();
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getLocalizedMessage());
            }
        });
    }
}