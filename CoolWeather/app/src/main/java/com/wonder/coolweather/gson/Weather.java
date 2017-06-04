package com.wonder.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wonder on 17/6/4.
 */

public class Weather {
    public String stutus;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("hourly_forecast")
    public List<HourlyForecast> hourlyForecastList;
}
