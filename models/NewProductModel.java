package com.example.cheriecakery.models;

public class NewProductModel {

    String img_url;
    String name;
    int price;

    public NewProductModel(){

    }

    public NewProductModel(String img_url, String name, int price) {
        this.img_url = img_url;
        this.name = name;
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
