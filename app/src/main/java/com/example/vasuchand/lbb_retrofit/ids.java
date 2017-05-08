package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class ids {
    @SerializedName("ids")
    private List<model_ids> result;

    public ids(List<model_ids> result) {
        this.result = result;
    }

    public List<model_ids> getResult() {

        return result;
    }

    public void setResult(List<model_ids> result) {
        this.result = result;
    }
}
