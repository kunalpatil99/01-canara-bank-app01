public class Product {

    // Instance variables
    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int id, String name, double price, int quantity) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 55000.00, 2);
        p1.displayProduct();
    }
}

