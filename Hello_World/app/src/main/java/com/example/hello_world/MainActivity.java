package com.example.hello_world;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickbtn(View var){
        Log.i("Login","login is successful");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String TAG = "Info";
        Log.e("error","The activity is not running");
        Log.v("show","Internet makes world small");
        Log.d(TAG,"The application starts here");
        Log.i("Normal","General_activity");
    }
}