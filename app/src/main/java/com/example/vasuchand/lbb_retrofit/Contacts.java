package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class Contacts {
    @SerializedName("contacts")
    private List<data> results;

    public List<data> getResults() {
        return results;
    }

    public void setResults(List<data> results) {
        this.results = results;
    }

    public Contacts(List<data> results) {

        this.results = results;
    }




}
