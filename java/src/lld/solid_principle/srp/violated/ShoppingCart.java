package lld.solid_principle.srp.violated;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    @SuppressWarnings("FieldMayBeFinal")
    private List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product p) {
        this.productList.add(p);
    }

    public List<Product> getProducts() {
        return productList;
    }

    // 1. Calculate total price in cart
    public double calculateTotalPrice() {
        double total = 0;

        for (int i = 0; i < productList.size(); i++) {
            double price = productList.get(i).productPrice;
            total += price;
        }

        return total;
    }

    // 2. Violating SRP - Prints invoice (should be separate class)
    @SuppressWarnings("unused")
    void printInvoice() {
        System.out.println("Shopping Cart Invoice:");

        for (Product p : productList) {
            System.out.println(p.productName + " : " + p.productPrice);
        }

        System.out.println("Total: $" + calculateTotalPrice());
    }

    // 3. Violating SRP - Saves to DB (should be in separate class)
    @SuppressWarnings("unused")
    void saveToDatabase() {
        System.out.println("Saving Shopping Cart to database...");
    }
}
