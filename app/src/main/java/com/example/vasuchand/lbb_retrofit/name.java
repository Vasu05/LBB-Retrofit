package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class name {
    @SerializedName("names")
    private Contacts results;

    public name(Contacts results) {
        this.results = results;
    }

    public Contacts getResults() {

        return results;
    }

    public void setResults(Contacts results) {
        this.results = results;
    }

}
