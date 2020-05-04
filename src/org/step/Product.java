package org.step;

public class Product implements IProduct {
    private String name;
    private Float price;

    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Price = %f",this.name,this.price);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.price.hashCode();
    }

    @Override
    public Float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
