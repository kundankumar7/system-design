package lld.solid_principle.ocp.followed;

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
}
