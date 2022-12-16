
public abstract class Product {

    private int price;
    private int idProduct;
    private String name;

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public Product(int price, int idProduct, String name) {
        this.price = price;
        this.idProduct = idProduct;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

}
