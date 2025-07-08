# Bookstore System (Java)

Java-based implementation of a simplified **Bookstore system**, designed with clean Object-Oriented Programming principles and extensible architecture.

It supports multiple book types, inventory management, and purchase flow handling with appropriate delivery mechanisms for digital and physical products.

## Features

- **Book Management**
  - Define books with ISBN, title, author, year, and price
  - Support for:
    - **PaperBook** (shipped, stock-limited)
    - **EBook** (emailed, file-based)
    - **DemoBook** (non-purchasable showcase)

- **Inventory Operations**
  - Add books to the inventory
  - Remove books older than a specific number of years
  - Lookup by ISBN

- **Purchase Flow**
  - Validate quantity and availability
  - Support both email and address-based delivery
  - Reduce stock for physical books
  - Throw clear errors when purchase is invalid
  - Return total amount paid

- **Delivery Logic**
  - Delivery handled by:
    - `ShippingService` for physical books
    - `MailService` for digital books
  - Decoupled delivery mechanism via `DeliveryService` interface


## Design & Structure

- `Book` is an abstract base class for all books.
- `Purchasable` is an abstract subclass for books that can be bought.
- `PaperBook`, `EBook`, and `DemoBook` are concrete book types.
- `Customer` holds email and address information.
- `Store` is responsible for managing the inventory and purchase operations.
- `DeliveryService` is a polymorphic interface implemented by:
  - `EmailService` (for email delivery)
  - `ShippingService` (for physical shipping)
- `QuantumBookstoreFullTest` is the main test class demonstrating the complete use case.


##  Technologies

- Language: **Java 8+**
- Dependencies: **None** (no external libraries)
- Design Style: **Pure Object-Oriented Programming**

## How to Use

### 1. Clone the Repository

Clone the repository to your local machine:

```bash
  git clone https://github.com/AhmedAmgadElsharkawy/ecommerce-system-java.git
```

### 2. run the application

```
  java src/ECommerceSystem.java
```

## License

This project is open-source and available under the [MIT Licence](LICENCE).
