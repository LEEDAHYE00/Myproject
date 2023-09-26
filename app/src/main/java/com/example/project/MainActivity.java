package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moveButton = findViewById(R.id.button);
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 다음 페이지로 이동하는 코드 (클릭버튼 -> 로그인 화면)
                //Intent intent = new Intent(getApplicationContext(), MainActivityLogin.class);
                //startActivity(intent);
            }
        });

    }
}

