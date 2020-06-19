package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SearchStoreActivity extends AppCompatActivity {

    private ImageView ImageView_Banner_02;

    private Button Button_Search;

    private Button Button_Search_Store_Search;

    private ImageView ImageView_Search_Store;

    private ImageView ImageView_Bot_Bar_01;
    private ImageView ImageView_Bot_Bar_02;
    private ImageView ImageView_Bot_Bar_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_store);

        ImageView_Banner_02 = findViewById(R.id.ImageView_Banner_02);

        Button_Search = findViewById(R.id.Button_Search);

        Button_Search_Store_Search = findViewById(R.id.Button_Search_Store_Search);

        ImageView_Search_Store = findViewById(R.id.ImageView_Search_Store);

        ImageView_Bot_Bar_01 = findViewById(R.id.ImageView_Bot_Bar_01);
        ImageView_Bot_Bar_02 = findViewById(R.id.ImageView_Bot_Bar_02);
        ImageView_Bot_Bar_03 = findViewById(R.id.ImageView_Bot_Bar_03);



        ImageView_Banner_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchStoreActivity.this, Banner02Activity.class);
                startActivity(intent);
            }
        });

        Button_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchStoreActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        Button_Search_Store_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView_Search_Store.setVisibility(android.view.View.VISIBLE);
            }
        });



        ImageView_Bot_Bar_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchStoreActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        ImageView_Bot_Bar_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchStoreActivity.this, MainHomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchStoreActivity.this, CustomerServiceActivity.class);
                startActivity(intent);
            }
        });

    }
}