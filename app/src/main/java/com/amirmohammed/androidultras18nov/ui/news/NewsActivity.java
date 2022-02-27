package com.amirmohammed.androidultras18nov.ui.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.adapters.NewsAdapter;
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
    private RecyclerView recyclerViewNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        recyclerViewNews = findViewById(R.id.rv_news);

        RetrofitClient.getApi().getNews("eg", "business")
                .enqueue(new Callback<NewsResponse>() {
                    @Override
                    public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                        if (response.isSuccessful()) {
                            news = response.body().getArticles();
                            NewsAdapter newsAdapter = new NewsAdapter(news);
                            recyclerViewNews.setAdapter(newsAdapter);

                        } else {

                        }
                    }

                    @Override
                    public void onFailure(Call<NewsResponse> call, Throwable t) {
                        Log.i(TAG, "onFailure: " + t.getLocalizedMessage());
                    }
                });

    }
}