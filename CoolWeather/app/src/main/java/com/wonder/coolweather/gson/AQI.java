package com.wonder.coolweather.gson;

/**
 * Created by wonder on 17/6/4.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
