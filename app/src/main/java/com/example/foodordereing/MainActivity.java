package com.example.foodordereing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating OnItemClickListener object
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                     public void onItemClick(AdapterView<?> listView,
                                             View itemView,
                                             int position,
                                             long id){
                         if (position==0){
                             Intent intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                             startActivity(intent);
                         }
                    }

    };
    ListView listView = (ListView)findViewById(R.id.list_options);
    listView.setOnItemClickListener(itemClickListener);
}}
