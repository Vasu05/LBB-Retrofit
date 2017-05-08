package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class model {


    @SerializedName("data")
    private model_combine results;

    public model(model_combine results) {
        this.results = results;
    }

    public model_combine getResults() {

        return results;
    }

    public void setResults(model_combine results) {
        this.results = results;
    }
}
