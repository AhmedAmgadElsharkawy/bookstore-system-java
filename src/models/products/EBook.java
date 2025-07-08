package models.products;

import services.deliveryServices.DeliveryService;

public class EBook extends Purchasable {
    private String filetype;

    public EBook(String isbn, String title, int year, DeliveryService deliveryService, double price, String filetype) {
        super(isbn, title, year, deliveryService, price);
        this.filetype = filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFiletype(String filetype) {
        return this.filetype;
    }

    @Override
    public double buy(int quantity) {
        return quantity * this.getPrice();
    }

}
