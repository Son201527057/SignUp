package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity {

    private ImageView ImageView_Banner_02;

    private Button Button_Search_Store;

    private Spinner Spinner_Search_Menu;

    private ImageView ImageView_Search_Coffee_01;
    private ImageView ImageView_Search_Coffee_02;

    private ImageView ImageView_Search_Ade_01;
    private ImageView ImageView_Search_Ade_02;

    private ImageView ImageView_Search_Tea_01;
    private ImageView ImageView_Search_Tea_02;

    private ImageView ImageView_Search_Dessert_01;
    private ImageView ImageView_Search_Dessert_02;

    private ImageView ImageView_Bot_Bar_01;
    private ImageView ImageView_Bot_Bar_02;
    private ImageView ImageView_Bot_Bar_03;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageView_Banner_02 = findViewById(R.id.ImageView_Banner_02);

        Button_Search_Store = findViewById(R.id.Button_Search_Store);

        Spinner_Search_Menu = findViewById(R.id.Spinner_Search_Menu);

        ImageView_Search_Coffee_01 = findViewById(R.id.ImageView_Search_Coffee_01);
        ImageView_Search_Coffee_02 = findViewById(R.id.ImageView_Search_Coffee_02);

        ImageView_Search_Ade_01 = findViewById(R.id.ImageView_Search_Ade_01);
        ImageView_Search_Ade_02 = findViewById(R.id.ImageView_Search_Ade_02);

        ImageView_Search_Tea_01 = findViewById(R.id.ImageView_Search_Tea_01);
        ImageView_Search_Tea_02 = findViewById(R.id.ImageView_Search_Tea_02);

        ImageView_Search_Dessert_01 = findViewById(R.id.ImageView_Search_Dessert_01);
        ImageView_Search_Dessert_02 = findViewById(R.id.ImageView_Search_Dessert_02);

        ImageView_Bot_Bar_01 = findViewById(R.id.ImageView_Bot_Bar_01);
        ImageView_Bot_Bar_02 = findViewById(R.id.ImageView_Bot_Bar_02);
        ImageView_Bot_Bar_03 = findViewById(R.id.ImageView_Bot_Bar_03);




        ImageView_Banner_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, Banner02Activity.class);
                startActivity(intent);
            }
        });



        ImageView_Search_Coffee_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchCoffee01.class);
                startActivity(intent);
            }
        });
        ImageView_Search_Coffee_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchCoffee02.class);
                startActivity(intent);
            }
        });

        ImageView_Search_Ade_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchAde01.class);
                startActivity(intent);
            }
        });
        ImageView_Search_Ade_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchAde02.class);
                startActivity(intent);
            }
        });

        ImageView_Search_Tea_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchTea01.class);
                startActivity(intent);
            }
        });
        ImageView_Search_Tea_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchTea02.class);
                startActivity(intent);
            }
        });

        ImageView_Search_Dessert_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchDessert01.class);
                startActivity(intent);
            }
        });
        ImageView_Search_Dessert_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchDessert02.class);
                startActivity(intent);
            }
        });




        Button_Search_Store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchStoreActivity.class);
                startActivity(intent);
            }
        });



        Spinner_Search_Menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0) {
                    ImageView_Search_Coffee_01.setVisibility(android.view.View.VISIBLE);
                    ImageView_Search_Coffee_02.setVisibility(android.view.View.VISIBLE);

                    ImageView_Search_Ade_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Ade_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Tea_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Tea_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Dessert_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Dessert_02.setVisibility(android.view.View.INVISIBLE);
                }
                else if(i==1) {
                    ImageView_Search_Ade_01.setVisibility(android.view.View.VISIBLE);
                    ImageView_Search_Ade_02.setVisibility(android.view.View.VISIBLE);

                    ImageView_Search_Coffee_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Coffee_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Tea_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Tea_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Dessert_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Dessert_02.setVisibility(android.view.View.INVISIBLE);

                }
                else if(i==2) {
                    ImageView_Search_Tea_01.setVisibility(android.view.View.VISIBLE);
                    ImageView_Search_Tea_02.setVisibility(android.view.View.VISIBLE);

                    ImageView_Search_Coffee_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Coffee_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Ade_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Ade_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Dessert_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Dessert_02.setVisibility(android.view.View.INVISIBLE);
                }
                else if(i==3) {
                    ImageView_Search_Dessert_01.setVisibility(android.view.View.VISIBLE);
                    ImageView_Search_Dessert_02.setVisibility(android.view.View.VISIBLE);

                    ImageView_Search_Coffee_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Coffee_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Ade_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Ade_02.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Tea_01.setVisibility(android.view.View.INVISIBLE);
                    ImageView_Search_Tea_02.setVisibility(android.view.View.INVISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });


        ImageView_Bot_Bar_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        ImageView_Bot_Bar_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, MainHomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, CustomerServiceActivity.class);
                startActivity(intent);
            }
        });

    }
}