package lld.solid_principle.ocp.violated;

public class Product {
    @SuppressWarnings("unused")
    String productName;
    @SuppressWarnings("unused")
    double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
