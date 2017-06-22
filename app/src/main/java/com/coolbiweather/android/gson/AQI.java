package com.coolbiweather.android.gson;

/**
 * Created by KaifengB1 on 2017/6/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
