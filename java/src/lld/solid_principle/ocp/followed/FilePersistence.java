package lld.solid_principle.ocp.followed;

public class FilePersistence extends Persistence {

    @SuppressWarnings("unused")
    ShoppingCart sc;

    public FilePersistence(ShoppingCart sc) {
        this.sc = sc;
    }

    @Override
    void save() {
        System.out.println("Saving shopping cart to File...");
    }
}
