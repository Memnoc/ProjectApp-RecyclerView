package com.smartdroidesign.recyclerview;

public class Items {
    private int imageResource;
    private String textOne;
    private String textTwo;

    public Items(int imageResource, String textOne, String textTwo) {
        this.imageResource = imageResource;
        this.textOne = textOne;
        this.textTwo = textTwo;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTextOne() {
        return textOne;
    }

    public String getTextTwo() {
        return textTwo;
    }
}
