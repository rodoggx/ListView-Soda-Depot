package com.example.sodadepot;

/**
 * Created by RodoggX on 10/22/2016.
 */

public class Drink {
    private String name;
    private String description;
    private int imgResId;

    public static final Drink[] drinks = {
            new Drink("Pepsi", "The Choice Of A New Generation", R.drawable.pepsi),
            new Drink("Coke", "Taste the Feeling", R.drawable.coke),
            new Drink("Sprite", "Obey Your Thirst", R.drawable.sprite)
    };

    public Drink(String name, String description, int imgResId) {
        this.name = name;
        this.description = description;
        this.imgResId = imgResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImgResId() {
        return imgResId;
    }

    @Override
    public String toString() {
        return this.name;
    }

    //end of class
}

