package models.products;

import services.deliveryServices.DeliveryService;

public class DemoBook extends Book {
    public DemoBook(String isbn, String title, int year, DeliveryService deliveryService) {
        super(isbn, title, year, deliveryService);
    }

}
