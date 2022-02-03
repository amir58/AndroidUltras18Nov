package com.amirmohammed.androidultras18nov.models;

public class CoffeeModel {
    private String name;
    private int price;
    public int quantity = 0;
    private String imageUrl;

    public CoffeeModel(String name, int price, String imageUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "CoffeeModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }


    public String getChar() {
        String name = "Amir Mohammed";
        String[] names = name.split(" ");

        String characters = names[0].charAt(0) + "";
        characters += names[1].charAt(0) + "";

        return characters;
    }

}
