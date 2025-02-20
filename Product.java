// Product.java
public class Product {
    private String productName;
    private int productId;
    private double price;
    private String category;
    private int quantity;
    
    private static int idCounter = 1000; // Starting product ID from 1000

    // Constructor
    public Product(String productName, double price, String category, int quantity) {
        this.productName = productName;
        this.productId = idCounter; // Assigning unique ID
        idCounter++; // Increment ID for next product
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    // Display function
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
        System.out.println("-----------------------------");
    }
}
