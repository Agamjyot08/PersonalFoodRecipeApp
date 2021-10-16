package com.android.personalfoodrecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailsActivity extends AppCompatActivity {

    TextView itemName;
    TextView itemIngredients;
    TextView itemSteps;
    ImageView itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        itemIngredients = (TextView) findViewById(R.id.txt_ing_info);
        itemImage = (ImageView) findViewById(R.id.itemImage);
        itemName = (TextView) findViewById(R.id.txt_dish_name);
        itemSteps = (TextView) findViewById(R.id.txt_steps_info);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            itemName.setText(bundle.getString("Name"));
            itemImage.setImageResource(bundle.getInt("Image"));
            itemIngredients.setText(bundle.getString("Ingredients"));
            itemSteps.setText(bundle.getString("Steps"));
        }

    }
}