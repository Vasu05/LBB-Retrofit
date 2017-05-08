package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class model_ids {
    @SerializedName("id")
    private String results;

    public model_ids(String results) {
        this.results = results;
    }

    public String getResults() {

        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
