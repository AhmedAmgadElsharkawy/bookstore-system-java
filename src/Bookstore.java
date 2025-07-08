import models.Customer;
import models.Store;
import models.products.Book;
import models.products.PaperBook;
import models.products.EBook;
import models.products.DemoBook;
import services.deliveryServices.EmailService;
import services.deliveryServices.ShippingService;

import java.util.List;

public class Bookstore {
    public static void main(String[] args) {
        System.out.println("Quantum book store: Starting tests...\n");

        Store store = new Store();

        // Setup delivery services
        EmailService mailService = new EmailService();
        ShippingService shippingService = new ShippingService();

        // Add books
        PaperBook paperBook1 = new PaperBook("123-A", "Java Fundamentals", 2015, shippingService, 150.0, 5);
        PaperBook paperBook2 = new PaperBook("124-A", "Head First Design Patterns", 2022, shippingService, 150.0, 5);
        EBook eBook = new EBook("456-B", "Clean Code", 2018, mailService, 100.0, "PDF");
        DemoBook demoBook = new DemoBook("789-C", "Unreleased Secrets", 2020, mailService);

        store.addBook(paperBook1);
        store.addBook(paperBook2);
        store.addBook(eBook);
        store.addBook(demoBook);

        // Remove outdated books (older than 8 years)
        List<Book> outdated = store.removeOutdated(8);
        for (Book book : outdated) {
            System.out.println("Removed outdated book: " + book.getTitle());
        }

        // Setup customer
        Customer customer = new Customer("Cairo, Egypt", "customer@example.com");

        // Try purchasing the paper book
        try {
            double amountPaid = store.buy("124-A", 2, customer);
            System.out.println("Paid amount: $" + amountPaid);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try purchasing the paper book with quantity > stock
        try {
            double amountPaid = store.buy("124-A", 4, customer);
            System.out.println("Paid amount: $" + amountPaid);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try purchasing the ebook
        try {
            double amountPaid = store.buy("456-B", 1, customer);
            System.out.println("Paid amount: $" + amountPaid);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try purchasing the demo book (throws error)
        try {
            store.buy("789-C", 1, customer);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try buying non-existent book
        try {
            store.buy("000-Z", 1, customer);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
