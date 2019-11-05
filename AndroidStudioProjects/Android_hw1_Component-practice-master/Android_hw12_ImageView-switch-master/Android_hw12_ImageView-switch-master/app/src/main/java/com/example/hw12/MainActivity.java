package com.example.hw12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
boolean CP =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChangePeople(View v){
        ImageView imageview = findViewById(R.id.imageView);
        if (CP==false){
            imageview.setImageResource(R.drawable.pyke);
            CP=true;
        }
        else {
            imageview.setImageResource(R.drawable.watergoast);
            CP=false;
        }
    }
}
