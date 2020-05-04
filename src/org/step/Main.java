package org.step;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Seller seller = new Seller("Продавец1");
        seller.addProduct(new Pen("Ручка",10f));
        seller.addProduct(new Pencil("Карандаш",5f));
        seller.getInfo();
        seller.saleProduct("Ручка");
        seller.getInfo();

        System.out.println("\n");

        Biginner biginner = new Biginner();
        biginner.addProduct(new Pen("Ручка",210f));
        biginner.addProduct(new Pencil("Карандаш",57f));
        biginner.addProduct(new Pencil("Карандаш",50f));
        biginner.addProduct(new Ruler("Линейка",250f));
        biginner.showInfo();
        biginner.sortByNameAndPrice();
        biginner.showInfo();
    }
}
