package lld.solid_principle.ocp.followed;

public class MongoPersistence extends Persistence {

    @SuppressWarnings("unused")
    ShoppingCart sc;

    public MongoPersistence(ShoppingCart sc) {
        this.sc = sc;
    }

    @Override
    void save() {
        System.out.println("Saving shopping cart to Mongo DB...");
    }
}
