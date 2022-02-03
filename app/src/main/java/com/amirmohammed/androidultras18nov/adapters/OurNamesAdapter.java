package com.amirmohammed.androidultras18nov.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amirmohammed.androidultras18nov.R;

import java.util.ArrayList;

// 1 => Constructor => receive arrayList from activity
// 2 => ViewHolder class => define views (findViewById)
// 3 => itemCount => return arrayList.size
// 4 => onCreateViewHolder => create design
// 5 => onBindViewHolder => actions ( setText, onClick, setTextColor )

public class OurNamesAdapter extends RecyclerView.Adapter<OurNamesAdapter.OurNamesHolder>{

    ArrayList<String> ourNames;

    public OurNamesAdapter(ArrayList<String> ourNames) {
        this.ourNames = ourNames;
    }

    @NonNull
    @Override
    public OurNamesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false);
        OurNamesHolder ourNamesHolder = new OurNamesHolder(view);
        return ourNamesHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OurNamesHolder holder, int position) {
        String name = ourNames.get(position);

        holder.textViewName.setText(name);

        holder.textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), holder.getAdapterPosition() + " : " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return ourNames.size(); // 6
    }


    class OurNamesHolder extends RecyclerView.ViewHolder{
        TextView textViewName;

        public OurNamesHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.item_name_tv_name);
        }
    }


}
