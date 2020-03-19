package com.example.zsbenweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //一开始先读取缓存，如果不为null说明之前已经请求过天气数据
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather_Id",null)!=null){
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
        }
    }
}
