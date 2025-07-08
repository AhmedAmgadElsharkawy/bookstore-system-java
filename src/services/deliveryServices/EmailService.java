package services.deliveryServices;

public class EmailService implements DeliveryService {
    @Override
    public void deliver(String bookTitle) {
        System.out.println(bookTitle+" book is Email delivered successfully!");
    }
}