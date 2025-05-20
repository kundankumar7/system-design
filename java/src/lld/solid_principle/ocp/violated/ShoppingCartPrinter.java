package lld.solid_principle.ocp.violated;

import java.util.List;

public class ShoppingCartPrinter {
    ShoppingCart sc;

    public ShoppingCartPrinter(ShoppingCart sc) {
        this.sc = sc;
    }

    @SuppressWarnings("unused")
    void printInvoice() {
        List<Product> productList = sc.getProducts();
        productList.forEach(p -> System.out.println(p.productName + " : " + p.productPrice)); // lambda

        double totalPrice = sc.calculateTotalPrice();
        System.out.println("Total price: " + totalPrice);
    }
}
