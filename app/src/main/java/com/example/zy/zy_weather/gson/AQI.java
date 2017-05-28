package com.example.zy.zy_weather.gson;

/**
 * Created by zy on 17-5-28.
 * 当前空气质量
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}
