package com.amirmohammed.androidultras18nov.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amirmohammed.androidultras18nov.R;
import com.amirmohammed.androidultras18nov.models.CoffeeModel;
import com.amirmohammed.androidultras18nov.ui.ICoffeesTotalPrice;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

// 1 => Constructor => receive arrayList from activity
// 2 => ViewHolder class => define views (findViewById)
// 3 => itemCount => return arrayList.size
// 4 => onCreateViewHolder => create design
// 5 => onBindViewHolder => actions ( setText, onClick, setTextColor )

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeeHolder> {
    ArrayList<CoffeeModel> coffees;
    ICoffeesTotalPrice iCoffeesTotalPrice;
    double totalPrice = 0;

    public CoffeeAdapter(ArrayList<CoffeeModel> coffees, ICoffeesTotalPrice iCoffeesTotalPrice) {
        this.coffees = coffees;
        this.iCoffeesTotalPrice = iCoffeesTotalPrice;
    }

    @NonNull
    @Override
    public CoffeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_coffee, parent, false);
        return new CoffeeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeHolder holder, int position) {
        CoffeeModel coffeeModel = coffees.get(position);

        holder.textViewName.setText(coffeeModel.getName());
        holder.textViewPrice.setText(String.valueOf(coffeeModel.getPrice()).concat(" EGP"));
        holder.textViewQuantity.setText(String.valueOf(coffeeModel.quantity));

        Picasso.get().load(coffeeModel.getImageUrl()).into(holder.imageViewProduct);

        holder.imageViewPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coffees.get(holder.getAdapterPosition()).quantity++;
                notifyItemChanged(holder.getAdapterPosition());
                totalPrice += coffees.get(holder.getAdapterPosition()).getPrice();
                iCoffeesTotalPrice.onTotalPriceChange(totalPrice);
            }
        });

        holder.imageViewMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coffees.get(holder.getAdapterPosition()).quantity == 0) return;
                coffees.get(holder.getAdapterPosition()).quantity--;
                notifyItemChanged(holder.getAdapterPosition());
                totalPrice -= coffees.get(holder.getAdapterPosition()).getPrice();
                iCoffeesTotalPrice.onTotalPriceChange(totalPrice);
            }
        });


    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    class CoffeeHolder extends RecyclerView.ViewHolder {
        ImageView imageViewProduct, imageViewMinus, imageViewPlus;
        TextView textViewName, textViewPrice, textViewQuantity;

        public CoffeeHolder(@NonNull View itemView) {
            super(itemView);
            imageViewProduct = itemView.findViewById(R.id.item_coffee_iv_product);
            imageViewMinus = itemView.findViewById(R.id.item_coffee_iv_minus);
            imageViewPlus = itemView.findViewById(R.id.item_coffee_iv_plus);
            textViewName = itemView.findViewById(R.id.item_coffee_tv_name);
            textViewPrice = itemView.findViewById(R.id.item_coffee_tv_price);
            textViewQuantity = itemView.findViewById(R.id.item_coffee_tv_quantity);
        }
    }
}
