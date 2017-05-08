package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class address {

    @SerializedName("address")
    private List<model_address> result;

    public address(List<model_address> result) {
        this.result = result;
    }

    public List<model_address> getResult() {

        return result;
    }

    public void setResult(List<model_address> result) {
        this.result = result;
    }


}
