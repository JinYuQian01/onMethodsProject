package com.example.onmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG="ActivityLife";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onRestart");
        super.onRestart();
    }
}