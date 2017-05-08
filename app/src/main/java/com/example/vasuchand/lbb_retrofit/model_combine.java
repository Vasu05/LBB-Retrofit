package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class model_combine {
    @SerializedName("ids")
    private List<model_ids> result;

    @SerializedName("address")
    private List<model_address> result2;

    public model_combine(List<model_ids> result, List<model_address> result2) {
        this.result = result;
        this.result2 = result2;
    }

    public List<model_ids> getResult() {

        return result;
    }

    public void setResult(List<model_ids> result) {
        this.result = result;
    }

    public List<model_address> getResult2() {
        return result2;
    }

    public void setResult2(List<model_address> result2) {
        this.result2 = result2;
    }



}
