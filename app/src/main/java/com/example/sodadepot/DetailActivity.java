package com.example.sodadepot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK = "EXTRA INFO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINK);
        Drink drink = Drink.drinks[drinkNo];

        ImageView image = (ImageView) findViewById(R.id.detailImg);
        image.setImageResource(drink.getImgResId());
        image.setContentDescription(drink.getName());

        TextView textViewName = (TextView) findViewById(R.id.detailName);
        textViewName.setText(drink.getName());

        TextView textViewDescr = (TextView) findViewById(R.id.detailDescription);
        textViewDescr.setText(drink.getDescription());
    }
}
