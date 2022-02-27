package com.amirmohammed.androidultras18nov.adapters;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.gen.ArticlesItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.Holder> {

    private final List<ArticlesItem> news;

    public NewsAdapter(List<ArticlesItem> news) {
        this.news = news;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ArticlesItem item = news.get(position);

        Picasso.get()
                .load(item.getImageUrl())
                .placeholder(R.drawable.android_ios)
                .into(holder.imageViewNews);
        holder.textViewTitle.setText(item.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(item.getUrl()));

                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        ImageView imageViewNews;
        TextView textViewTitle;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageViewNews = itemView.findViewById(R.id.iv_news_image);
            textViewTitle = itemView.findViewById(R.id.tv_news_title);
        }
    }
}
