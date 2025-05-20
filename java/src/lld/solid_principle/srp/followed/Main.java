package lld.solid_principle.srp.followed;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // create product
        Product p1 = new Product("Watch", 9999);
        Product p2 = new Product("Ring", 91999);
        Product p3 = new Product("Book", 35999);

        // Add product in cart
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(p1);
        sc.addProduct(p2);
        sc.addProduct(p3);
        List<Product> productList = sc.getProducts();
        productList.forEach(p -> System.out.println(p.productName + " : " + p.productPrice)); // lambda

        // Invoice
        System.out.println("Shopping Cart Invoice");
        ShoppingCartPrinter scp = new ShoppingCartPrinter(sc);
        scp.printInvoice();

        // Save to database
        ShoppingCartStorage scs = new ShoppingCartStorage(sc);
        scs.saveToDatabase();
    }
}
