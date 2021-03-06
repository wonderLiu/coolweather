package com.wonder.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wonder on 17/6/4.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
