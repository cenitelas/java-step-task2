package org.step;

import java.util.ArrayList;
import java.util.List;

public class Biginner {
    private List<IProduct> products;

    public Biginner() {
        this.products = new ArrayList<>();
    }

    public void addProduct(IProduct product){
        this.products.add(product);
    }

    public Float getPrice(){
        Float price = 0F;
        for(IProduct product : products){
            price+=product.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return "Biginner" +
                "products=" + products +
                '}';
    }

    public void sortByPrice (){
        this.products.sort((IProduct a, IProduct b) ->{
            return (a.getPrice()>b.getPrice())?1:(a.getPrice()<b.getPrice())?-1:0;
        });
    }

    public void sortByName(){
        this.products.sort((a,b)->{
            return a.getName().compareTo(b.getName());
        });
    }

    public void sortByNameAndPrice(){
        this.sortByPrice();
        this.sortByName();
    }

    public void showInfo(){
        System.out.println("Набор Biginner");
        for(IProduct product : products){
            System.out.println(product.toString());
        }
        System.out.printf("Общая стоимость = %f\n",this.getPrice());
    }
}
