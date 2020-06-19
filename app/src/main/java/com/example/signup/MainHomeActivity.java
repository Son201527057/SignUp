package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainHomeActivity extends AppCompatActivity {

    private ImageView ImageView_Banner_01;

    private ImageView ImageView_Popularity_01;
    private ImageView ImageView_Popularity_02;
    private ImageView ImageView_Popularity_03;

    private ImageView ImageView_Recommend_01;
    private ImageView ImageView_Recommend_02;
    private ImageView ImageView_Recommend_03;

    private ImageView ImageView_Bot_Bar_01;
    private ImageView ImageView_Bot_Bar_02;
    private ImageView ImageView_Bot_Bar_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        ImageView_Banner_01 = findViewById(R.id.ImageView_Banner_01);

        ImageView_Popularity_01 = findViewById(R.id.ImageView_Popularity_01);
        ImageView_Popularity_02 = findViewById(R.id.ImageView_Popularity_02);
        ImageView_Popularity_03 = findViewById(R.id.ImageView_Popularity_03);

        ImageView_Recommend_01 = findViewById(R.id.ImageView_Recommend_01);
        ImageView_Recommend_02 = findViewById(R.id.ImageView_Recommend_02);
        ImageView_Recommend_03 = findViewById(R.id.ImageView_Recommend_03);

        ImageView_Bot_Bar_01 = findViewById(R.id.ImageView_Bot_Bar_01);
        ImageView_Bot_Bar_02 = findViewById(R.id.ImageView_Bot_Bar_02);
        ImageView_Bot_Bar_03 = findViewById(R.id.ImageView_Bot_Bar_03);



        ImageView_Banner_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, Banner01Activity.class);
                startActivity(intent);
            }
        });



        ImageView_Popularity_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, PopularityMenu01Activity.class);
                startActivity(intent);
            }
        });

        ImageView_Popularity_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, PopularityMenu02Activity.class);
                startActivity(intent);
            }
        });

        ImageView_Popularity_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, PopularityMenu03Activity.class);
                startActivity(intent);
            }
        });



        ImageView_Recommend_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, RecommendMenu01Activity.class);
                startActivity(intent);
            }
        });

        ImageView_Recommend_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, RecommendMenu02Activity.class);
                startActivity(intent);
            }
        });

        ImageView_Recommend_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, RecommendMenu03Activity.class);
                startActivity(intent);
            }
        });




        ImageView_Bot_Bar_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        ImageView_Bot_Bar_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, MainHomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainHomeActivity.this, CustomerServiceActivity.class);
                startActivity(intent);
            }
        });


    }
}