package models.products;


public class DemoBook extends Book{
    public DemoBook(String isbn, String title, int year, double price) {
        super(isbn, title, year, price);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }

}
