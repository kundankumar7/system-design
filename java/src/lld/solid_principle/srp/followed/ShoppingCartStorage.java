package lld.solid_principle.srp.followed;

public class ShoppingCartStorage {

    @SuppressWarnings("unused")
    ShoppingCart sc;

    public ShoppingCartStorage(ShoppingCart sc) {
        this.sc = sc;
    }

    @SuppressWarnings("unused")
    void saveToDatabase() {
        System.out.println("Saving Shopping Cart to database...");
    }
}
