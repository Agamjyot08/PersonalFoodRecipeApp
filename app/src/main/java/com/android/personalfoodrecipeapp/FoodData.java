package com.android.personalfoodrecipeapp;

public class FoodData {

    private String itemName;
    private String itemIngredients;
    private String ItemSteps;
    private int ItemImage;

    public FoodData() {
    }

    public FoodData(String itemName, String itemIngredients, String itemSteps, int itemImage) {
        this.itemName = itemName;
        this.itemIngredients = itemIngredients;
        ItemSteps = itemSteps;
        ItemImage = itemImage;
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

    public int getItemImage() {
        return ItemImage;
    }
}
