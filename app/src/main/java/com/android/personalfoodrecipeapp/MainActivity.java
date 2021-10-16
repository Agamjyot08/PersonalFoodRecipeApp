package com.android.personalfoodrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<FoodData> myItemList;
    FoodData foodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        myItemList = new ArrayList<>();

        foodData = new FoodData("Sample dish name", "sample", "sample", R.drawable.ic_launcher_background);

        myItemList.add(foodData);

        foodData = new FoodData("Sample dish name", "sample", "sample", R.drawable.ic_launcher_background);

        myItemList.add(foodData);

        Adapter myAdapter = new Adapter(MainActivity.this, myItemList);
        recyclerView.setAdapter(myAdapter);
    }
}