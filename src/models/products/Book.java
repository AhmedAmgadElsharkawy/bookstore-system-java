package models.products;

public abstract class Book {
    private String isbn;
    private String title;
    private int year;
    private double price;

    public Book(String isbn, String title, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
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

    public double getPrice() {
        return this.price;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean isPurchasable();
}
