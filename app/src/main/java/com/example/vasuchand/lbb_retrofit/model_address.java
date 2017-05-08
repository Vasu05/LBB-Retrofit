package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class model_address {
    @SerializedName("primary_address")
    String address;
    @SerializedName("phone")
    phone mobile;

    public model_address(String address, phone mobile) {
        this.address = address;
        this.mobile = mobile;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public phone getMobile() {
        return mobile;
    }

    public void setMobile(phone mobile) {
        this.mobile = mobile;
    }
}
