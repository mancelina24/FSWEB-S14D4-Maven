package org.example.model;

public class Store {
    public static void main(String[] args) {

        // ProductForSale dizisi oluşturma
ProductForSale[] products=new ProductForSale[4];
        // Obje örneklerini oluşturma ve diziye ekleme

        products[0] = new Chocolate("Delicious milk chocolate", 2.50, "Milk Chocolate");
        products[1] = new Coke("Refreshing fizzy drink", 1.00, "bitter");
        products[2] = new Bread("Freshly baked whole wheat bread", 1.80, "Whole Wheat");
        products[3]= new Chocolate("Dubai",300,"with biscuit","nuts");


        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

    }
}