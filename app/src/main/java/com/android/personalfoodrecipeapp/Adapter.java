package com.android.personalfoodrecipeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context mContext;
    private List<FoodData> myItemList;

    public Adapter(Context mContext, List<FoodData> myItemList) {
        this.mContext = mContext;
        this.myItemList = myItemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item_view,viewGroup,false);

        return new ItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {

        itemViewHolder.itemImage.setImageResource(myItemList.get(i).getItemImage());
        itemViewHolder.title.setText(myItemList.get(i).getItemName());


        itemViewHolder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ItemDetailsActivity.class);
                intent.putExtra("Image", myItemList.get(itemViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("Name", myItemList.get(itemViewHolder.getAdapterPosition()).getItemName());
                intent.putExtra("Ingredients", myItemList.get(itemViewHolder.getAdapterPosition()).getItemIngredients());
                intent.putExtra("Steps", myItemList.get(itemViewHolder.getAdapterPosition()).getItemSteps());

                mContext.startActivity(intent);
            }

        });    }

    @Override
    public int getItemCount() {
        return myItemList.size();
    }
}

class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView itemImage;
    TextView title;
    TextView ingredients;
    TextView steps;
    CardView cardView;

    public ItemViewHolder(View itemView) {
        super(itemView);

        itemImage = itemView.findViewById(R.id.itemImage);
        title = itemView.findViewById(R.id.title);
        cardView = itemView.findViewById(R.id.cardView);
        ingredients = itemView.findViewById(R.id.txt_ing_info);
        steps = itemView.findViewById(R.id.txt_steps_info);

    }
}
