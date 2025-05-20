package lld.solid_principle.srp.violated;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Watch", 9999);
        Product p2 = new Product("Ring", 91999);
        Product p3 = new Product("Book", 35999);

        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(p1);
        sc.addProduct(p2);
        sc.addProduct(p3);
        List<Product> productList = sc.getProducts();
        productList.forEach(p -> System.out.println(p.productName + " : " + p.productPrice)); // lambda
        sc.calculateTotalPrice();
        sc.printInvoice();
        sc.saveToDatabase();
    }
}
