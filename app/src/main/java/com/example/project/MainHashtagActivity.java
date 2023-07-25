package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainHashtagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hashtag);

    }
    private SpannableString applyHashtags(String text) {
        SpannableString spannable = new SpannableString(text);
        Pattern hashtagPattern = Pattern.compile("#\\w+");
        Matcher matcher = hashtagPattern.matcher(text);

        while (matcher.find()) {
            int hashtagStart = matcher.start();
            int hashtagEnd = matcher.end();

            ClickableSpan clickableSpan = new ClickableSpan() {
                @Override
                public void onClick(@NonNull View widget) {
                    String clickedHashtag = text.substring(hashtagStart, hashtagEnd);
                    // 해시태그를 클릭하면 수행할 작업 작성: 해시태그 클릭시 관련 목록 뜨게끔 하는 명령어<필요: 데이터목록.서버
                    Toast.makeText(MainHashtagActivity.this, clickedHashtag, Toast.LENGTH_SHORT).show();

                }
            };
            spannable.setSpan(clickableSpan, hashtagStart, hashtagEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        return spannable;
    }
    TextView textView = findViewById(R.id.hashtag1);

}

