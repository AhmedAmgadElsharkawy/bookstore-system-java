package models.products;

import services.deliveryServices.DeliveryService;

public class PaperBook extends Purchasable {
    private int stock;

    public PaperBook(String isbn, String title, int year, DeliveryService deliveryService, double price, int stock) {
        super(isbn, title, year, deliveryService, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public double buy(int quantity) {
        if (this.stock < quantity)
            throw new RuntimeException("Quantum book store: Not enough stock available");
        this.stock -= quantity;
        return quantity * this.getPrice();
    }
}
