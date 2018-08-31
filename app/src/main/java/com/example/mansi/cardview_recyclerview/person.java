package com.example.mansi.cardview_recyclerview;

public class person {
    private String name,contact;
    private int image;
    public person(String name, String contact, int image) {
        this.name = name;
        this.contact = contact;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public int getImage() {
        return image;
    }


}
