package com.example.sodadepot;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
        listView.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        super.onListItemClick(listView, itemView, position, id);

        Intent intent = new Intent(CategoryActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_DRINK, (int) id);
        startActivity(intent);
    }
}
