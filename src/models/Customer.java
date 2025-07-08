package models;

public class Customer {
    private String address;
    private String email;

    public Customer(String address, String email) {
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
