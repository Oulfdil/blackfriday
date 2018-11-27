package com.indev.blackfriday;

public class Product {
    private String type;
    private int price;
    private int quantite;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Product(int quantite, String type, int price ){
        this.price=price;
        this.type=type;
        this.quantite=quantite;


    }
}
