package com.wonder.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wonder on 17/6/4.
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
