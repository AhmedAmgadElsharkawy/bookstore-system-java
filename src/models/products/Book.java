package models.products;

import services.deliveryServices.DeliveryService;

public abstract class Book {
    private String isbn;
    private String title;
    private int year;
    private DeliveryService deliveryService;

    public Book(String isbn, String title, int year, DeliveryService deliveryService) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.deliveryService = deliveryService;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DeliveryService getDelliveryService() {
        return deliveryService;
    }

    public void getDelliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void deliver() {
        deliveryService.deliver(this.title);
    }
}
