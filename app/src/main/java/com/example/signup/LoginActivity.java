package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    // 버튼 생성
    private Button Button_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 로그인화면에서 로그인버튼 눌렀을 때 메인화면으로 액티비티 이동
        Button_Login = findViewById(R.id.Button_Login);
        Button_Login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainHomeActivity.class);
                startActivity(intent);
            }
        });



        // 기존에 만들었던 것
        TextView registerButton = (TextView) findViewById(R.id.registerButton); registerButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, SignUpActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });





    }
}
