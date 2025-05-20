package lld.solid_principle.ocp.violated;

public class ShoppingCartStorage {
    @SuppressWarnings("unused")
    ShoppingCart sc;

    public ShoppingCartStorage(ShoppingCart sc) {
        this.sc = sc;
    }

    @SuppressWarnings("unused")
    void saveToSQLDatabase() {
        System.out.println("Saving Shopping Cart to SQL DB...");
    }
    
    @SuppressWarnings("unused")
    void saveToMongoDatabase(){
        System.out.println("Saving Shopping Cart to Mongo DB...");
    }
    
    @SuppressWarnings("unused")
    void saveToFile(){
        System.out.println("Saving Shopping Cart to File...");
    }
}
