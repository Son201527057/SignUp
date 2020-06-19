package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CustomerServiceActivity extends AppCompatActivity {

    private ImageView ImageView_Banner_01;

    private Button Button_Customer_Service;

    private ImageView ImageView_Bot_Bar_01;
    private ImageView ImageView_Bot_Bar_02;
    private ImageView ImageView_Bot_Bar_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_service);

        ImageView_Banner_01 = findViewById(R.id.ImageView_Banner_01);
        Button_Customer_Service = findViewById(R.id.Button_Customer_Service);

        ImageView_Bot_Bar_01 = findViewById(R.id.ImageView_Bot_Bar_01);
        ImageView_Bot_Bar_02 = findViewById(R.id.ImageView_Bot_Bar_02);
        ImageView_Bot_Bar_03 = findViewById(R.id.ImageView_Bot_Bar_03);



        ImageView_Banner_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerServiceActivity.this, Banner01Activity.class);
                startActivity(intent);
            }
        });

        Button_Customer_Service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerServiceActivity.this, CustomerPostingActivity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerServiceActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });


        ImageView_Bot_Bar_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerServiceActivity.this, MainHomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView_Bot_Bar_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerServiceActivity.this, CustomerServiceActivity.class);
                startActivity(intent);
            }
        });

    }
}