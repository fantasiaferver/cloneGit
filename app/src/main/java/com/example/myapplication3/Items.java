package com.example.myapplication3;

public class Items {
    private String name;
    private String content;
    private String Price;
    private int imgItem;

    public Items(String name, String content, String price, int imgItem) {
        this.name = name;
        this.content = content;
        Price = price;
        this.imgItem = imgItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getPrice() {
        return Price;
    }

    public int getImgItem() {
        return imgItem;
    }
}
