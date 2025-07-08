package models;

import models.products.Book;
import models.products.Purchasable;

import java.util.*;

public class Store {
    private final Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public List<Book> removeOutdated(int age) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Book> outdated = new ArrayList<>();

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next().getValue();
            if ((currentYear - book.getYear()) > age) {
                iterator.remove();
                outdated.add(book);
            }
        }
        return outdated;
    }

    public double buy(String isbn, int quantity, Customer customer) {
        Book book = inventory.get(isbn);
        if (book == null)
            throw new RuntimeException("Book not found");
        if (!(book instanceof Purchasable))
            throw new RuntimeException("Book is not for sale");
        double paid = ((Purchasable) book).buy(quantity);
        book.deliver();
        return paid;
    }
}
