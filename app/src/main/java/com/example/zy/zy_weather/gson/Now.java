package com.example.zy.zy_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zy on 17-5-28.
 * 当前的天气信息
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }

}
