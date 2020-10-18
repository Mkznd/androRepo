package com.example.myapplication.models;

public class DayForecast {
    public String day;
    public String tempMin;
    public String tempMax;
    public String wind;
    public String status;

    public DayForecast(String day, String tempMin, String tempMax, String wind, String status) {
        this.day = day;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.wind = wind;
        this.status = status;
    }
}
