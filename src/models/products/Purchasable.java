package models.products;

public abstract class Purchasable extends Book {
    private double price;

    public Purchasable(String isbn, String title, int year, double price) {
        super(isbn, title, year);
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}