package com.example.view;

public class Test {
    private int img;
    private String name;
    private String price;

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Test(int img, String name, String price) {
        this.img = img;
        this.name = name;
        this.price = price;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
