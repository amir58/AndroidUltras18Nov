package com.amirmohammed.androidultras18nov.models;

// Product => productId, merchantId, price, name, description, image
public class Product {
    private int productId;
    private int merchantId;
    private double price;
    private String name;
    private String image;

    public Product(int productId, int merchantId, double price, String name, String image) {
        this.productId = productId;
        this.merchantId = merchantId;
        this.price = price;
        this.name = name;
        this.image = image;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void printProductData(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", merchantId=" + merchantId +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
