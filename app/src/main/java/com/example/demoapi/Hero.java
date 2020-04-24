package com.example.demoapi;

public class Hero {

    String name, imageURL;

    public Hero(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }
}

