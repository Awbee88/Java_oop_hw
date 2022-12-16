import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine(List<HotDrinkProduct> hotDrinkProducts) {
        this.hotDrinkProducts = hotDrinkProducts;
    }

    @Override
    public int getPrice(int idProduct) {
        for (HotDrinkProduct product : hotDrinkProducts) {
            if (product.getIdProduct() == idProduct) {
                return product.getPrice();
            }
        }
        return 000;
    }

    @Override
    public String getProduct(int idProduct) {
        System.out.println("Автомат горячих напитков готовит необходимый вам заказ...");
        for (HotDrinkProduct product : hotDrinkProducts) {
            if (product.getIdProduct() == idProduct) {
                return "Вы можете забрать свой Напиток: " + product.getName() + " объемом: " + product.getVolume() + " мл и температурой: " + product.getTemperature() + " градусов" ;
            }
        }
        return "Error";
    }


}
