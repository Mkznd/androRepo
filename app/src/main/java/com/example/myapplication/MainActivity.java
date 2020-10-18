package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapters.DayAdapter;
import com.example.myapplication.models.DayForecast;

public class MainActivity extends AppCompatActivity {
    private DayForecast[] values = new DayForecast[]{
            new DayForecast("Monday", "17","25","n","sunny"),
            new DayForecast("Tuesday", "18","25","n","sunny"),
            new DayForecast("Wednesday", "19","25","n","sunny"),
            new DayForecast("Thursday", "20","25","n","sunny"),
            new DayForecast("Friday", "19","25","n","sunny"),
            new DayForecast("Saturday", "18","25","n","sunny"),
            new DayForecast("Sunday", "17","25","n","sunny"),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DayAdapter dayAdapter = new DayAdapter(this, R.layout.dayforecast);
        dayAdapter.addAll(values);
        ListView listView = (ListView) findViewById(R.id.days);
        listView.setAdapter(dayAdapter);
    }
}