package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchDessert02 extends AppCompatActivity {

    private ImageView ImageView_Banner_03;

    private ImageView ImageView_Bot_Bar_01;
    private ImageView ImageView_Bot_Bar_02;
    private ImageView ImageView_Bot_Bar_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_dessert02);

        ImageView_Banner_03 = findViewById(R.id.ImageView_Banner_03);

        ImageView_Bot_Bar_01 = findViewById(R.id.ImageView_Bot_Bar_01);
        ImageView_Bot_Bar_02 = findViewById(R.id.ImageView_Bot_Bar_02);
        ImageView_Bot_Bar_03 = findViewById(R.id.ImageView_Bot_Bar_03);


        ImageView_Banner_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDessert02.this, Banner03Activity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDessert02.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        ImageView_Bot_Bar_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDessert02.this, MainHomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDessert02.this, CustomerServiceActivity.class);
                startActivity(intent);
            }
        });
    }
}