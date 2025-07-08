package models.products;

import services.deliveryServices.DeliveryService;

public abstract class Purchasable extends Book {
    private double price;

    public Purchasable(String isbn, String title, int year, DeliveryService deliveryService, double price) {
        super(isbn, title, year, deliveryService);
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double buy(int quantity);
}