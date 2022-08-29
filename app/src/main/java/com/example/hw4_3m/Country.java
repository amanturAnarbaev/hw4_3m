package com.example.hw4_3m;

public class Country {
     private String name;
     private String imade_flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImade_flag() {
        return imade_flag;
    }

    public void setImade_flag(String imade_flag) {
        this.imade_flag = imade_flag;
    }

    public Country(String name, String imade_flag) {
        this.name = name;
        this.imade_flag = imade_flag;
    }
}
