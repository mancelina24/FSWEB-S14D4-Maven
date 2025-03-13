package org.example.model;

public class Chocolate extends ProductForSale{
    private String chocolateType;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType = chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    @Override
    void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Chocolate Type: " + getChocolateType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("-----------------------");
    }
}
