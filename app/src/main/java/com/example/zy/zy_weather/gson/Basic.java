package com.example.zy.zy_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zy on 17-5-28.
 * 城市的基本信息
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
