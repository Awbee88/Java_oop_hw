import java.util.List;

public class StandartVendingMachine extends VendingMachine {

    public StandartVendingMachine(List<Product> products) {
        this.products = products;
    }

    @Override
    public String getProduct(int idProduct) {
        System.out.println("Торговой автомат ищет необходимый вам заказ...");
        for (Product product : products) {
            if (product.getIdProduct() == idProduct) {
                return "Вы можете забрать свой товар: " + product.getName();
            }
        }
        return "Error";
    }

    @Override
    public int getPrice(int idProduct) {
        for (Product product : products) {
            if (product.getIdProduct() == idProduct) {
                return product.getPrice();
            }
        }
        return 0;
    }

}
