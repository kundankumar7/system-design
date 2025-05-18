package lld.solid_principle.voilate_srp;

import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public void addProduct(Product p) {
        this.productList.add(p);
    }

    public List<Product> getProducts() {
        return productList;
    }

    // Calculate total price in cart
    public double calculateTotalPrice() {
        double total = 0;

        for (int i = 0; i < productList.size(); i++) {
            double price = productList.get(i).productPrice;
            total += price;
        }

        return total;
    }
}
