package com.example.zy.zy_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zy on 17-5-28.
 * 天气健康建议
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;


    @SerializedName("cw")
    public CarWash carWash;



    public Sport sport;



    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }


    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}
