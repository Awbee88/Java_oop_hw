public class ChockolateProduct extends Product {


    private String type;

    public ChockolateProduct(int price, int idProduct, String name, String type) {
        super(price, idProduct, name);
        this.type = type;
    }
    
}
