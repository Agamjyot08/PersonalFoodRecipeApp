package com.android.personalfoodrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.ArrayList;

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
    public void onBindViewHolder(@NonNull ItemViewHolder ItemViewHolder, int i) {

        ItemViewHolder.imageView.setImageResource(myItemList.get(i).getItemImage());
        ItemViewHolder.title.setText(myItemList.get(i).getItemName());
    }

    @Override
    public int getItemCount() {
        return myItemList.size();
    }
}

class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView title;

    public ItemViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView);
        title = itemView.findViewById(R.id.title);

    }
}
