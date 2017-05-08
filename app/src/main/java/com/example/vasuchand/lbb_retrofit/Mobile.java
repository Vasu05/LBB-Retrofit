package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class Mobile {


    @SerializedName("primary_mobile")
    String mobile;
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Mobile(String mobile) {

        this.mobile = mobile;
    }
}
