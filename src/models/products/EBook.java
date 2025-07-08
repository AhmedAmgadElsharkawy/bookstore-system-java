package models.products;

public class EBook extends Book {
    private String filetype;

    public EBook(String isbn, String title, int year, double price, String filetype) {
        super(isbn, title, year, price);
        this.filetype = filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFiletype(String filetype) {
        return this.filetype;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

}
