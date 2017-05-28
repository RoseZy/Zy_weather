package com.example.zy.zy_weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zy on 17-5-28.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
