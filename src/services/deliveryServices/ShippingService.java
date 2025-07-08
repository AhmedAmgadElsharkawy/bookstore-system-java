package services.deliveryServices;

public class ShippingService implements DeliveryService {
    @Override
    public void deliver(String bookTitle) {
        System.out.println(bookTitle +" book is shipped successfully!");
    }
}
