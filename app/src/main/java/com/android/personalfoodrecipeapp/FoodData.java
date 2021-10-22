package com.android.personalfoodrecipeapp;

public class FoodData {

    private String itemName;
    private String itemIngredients;
    private String ItemSteps;
    private String ItemImage;

    public FoodData() {
    }

    public FoodData(String itemName, String itemIngredients, String itemSteps, String itemImage) {
        this.itemName = itemName;
        this.itemIngredients = itemIngredients;
        this.ItemSteps = itemSteps;
        this.ItemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemIngredients() {
        return itemIngredients;
    }

    public String getItemSteps() {
        return ItemSteps;
    }

    public String getItemImage() {
        return ItemImage;
    }
}
