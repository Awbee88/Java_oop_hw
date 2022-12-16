public class DrinkProduct extends Product {

    private int volume;

    public int getVolume() {
        return volume;
    }

    public DrinkProduct(int price, int idProduct, String name, int volume) {
        super(price, idProduct, name);
        this.volume = volume;
    }
    
}
