package com.example.vasuchand.lbb_retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class phone {


    @SerializedName("primary_mobile")
    primary_mobile mobile;
    @SerializedName("office")
    String office;
    @SerializedName("home")
    String home;

    public phone(primary_mobile mobile, String office, String home) {

        this.mobile = mobile;
        this.office = office;
        this.home = home;
    }

    public primary_mobile getMobile() {
        return mobile;
    }

    public void setMobile(primary_mobile mobile) {
        this.mobile = mobile;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

}
