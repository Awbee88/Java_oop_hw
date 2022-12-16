public class HotDrinkProduct extends DrinkProduct {

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public HotDrinkProduct(int price, int idProduct, String name, int volume, int temperature) {
        super(price, idProduct, name, volume);
        this.temperature = temperature;
    }

    
}
