package org.step;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    private int saleCount;
    private Float totalSum;
    private String name;
    private List<IProduct> products;

    public Seller(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.saleCount=0;
        this.totalSum=0f;
    }

    public String getName(){
        return this.name;
    }

    public Float getTotal(){
        return this.totalSum;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    public void addProduct(IProduct product){
        this.products.add(product);
    }

    public int getCount(){
        return this.saleCount;
    }

    public void saleProduct(String name){
        for(IProduct product : this.products){
            if(product.getName().equals(name)){
                this.totalSum+=product.getPrice();
            }
        }
        this.products.removeIf(i->i.getName().equals(name));
        saleCount+=1;
    }

    public void getInfo(){
        System.out.printf("Name: %s\n" +
                "Count sale = %d\n" +
                "Total sum = %f\n",this.name, this.getCount(), this.getTotal());
    }
}
