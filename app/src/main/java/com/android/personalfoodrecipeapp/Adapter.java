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

public class Adapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context mContext;
    private List<FoodData> myItemList;

    public Adapter(Context mContext, List<FoodData> myItemList) {
        this.mContext = mContext;
        this.myItemList = myItemList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item_view, viewGroup, false);

        return new ItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {

        itemViewHolder.imageView.setImageResource(myItemList.get(i).getItemImage());
        itemViewHolder.title.setText(myItemList.get(i).getItemName());
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
        title = title.findViewById(R.id.title);

    }
}
