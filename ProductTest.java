public class ProductTest {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 850.99, "Electronics", 5);
        Product product2 = new Product("Headphones", 59.99, "Accessories", 10);
        Product product3 = new Product("Smartphone", 499.99, "Electronics", 8);

        // Display product details
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }
}
