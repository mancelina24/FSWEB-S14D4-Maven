package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;
    private boolean isFresh;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String breadType, boolean isFresh) {
        super(type, price, description);
        this.breadType = breadType;
        this.isFresh = isFresh;
    }

    public String getBreadType() {
        return breadType;
    }

    public boolean isFresh() {
        return isFresh;
    }

    @Override
    void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Bread Type: " + getBreadType());
        System.out.println("Fresh?: " + (isFresh() ? "Yes" : "No"));
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("-----------------------");
    }
}
