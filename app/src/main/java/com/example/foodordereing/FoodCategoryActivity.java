package com.example.foodordereing;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listFooods = getListView();
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(
                this,
                android.R.layout.simple_list_item_1,
                Food.food);
        listFooods.setAdapter(listAdapter);

        )

    }

}
