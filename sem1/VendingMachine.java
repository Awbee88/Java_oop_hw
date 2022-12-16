import java.util.List;

public abstract class VendingMachine {
    
    protected List<Product> products;
    protected List<HotDrinkProduct> hotDrinkProducts;


    public abstract int getPrice(int idProduct);

    public void buyInfo (int idProduct) {
        System.out.printf("Покупатель оплатил товар с id: %d \n", idProduct);
    }

    public abstract String getProduct(int idProduct);
}
