package com.indev.blackfriday;
import java.util.ArrayList;

public class Company {
    private ArrayList<Product> products;

    public Company(){
        this.products = new ArrayList<Product>();

    }

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        Product product=new Product(i, capsule, i1);
        this.products.add(product);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int total=0;
        for(Product product : products ){
            total+=product.getPrice()*product.getQuantite();
        }
        return total;
    }

    public Company blackFriday() {
        return this;
    }
}
