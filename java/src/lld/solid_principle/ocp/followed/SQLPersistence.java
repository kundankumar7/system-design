package lld.solid_principle.ocp.followed;

public class SQLPersistence extends Persistence {

    @SuppressWarnings("unused")
    ShoppingCart sc;

    public SQLPersistence(ShoppingCart sc) {
        this.sc = sc;
    }

    @Override
    void save() {
        System.out.println("Saving shopping cart to SQL DB...");
    }
}
