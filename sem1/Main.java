import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите id товара: ");
        int id = Integer.parseInt(scan.nextLine());

        List<Product> products = new ArrayList<>();
        products.add(new ChipsProduct(65, 1, "Lays", "yellow"));
        products.add(new ChockolateProduct(80, 2, "Nuts", "dark chocolate"));
        products.add(new DrinkProduct(60, 3, "Nestle Tea", 500));

        StandartVendingMachine machine1 = new StandartVendingMachine(products);

        System.out.printf("Данный товар стоит %d рублей\n", machine1.getPrice(id));
        machine1.buyInfo(id);
        System.out.println(machine1.getProduct(id));


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите id товара: ");
        int id2 = Integer.parseInt(scan2.nextLine());

        List<HotDrinkProduct> hotDrinkProducts = new ArrayList<>();
        hotDrinkProducts.add(new HotDrinkProduct(100, 1, "Green Tea", 250, 80));
        hotDrinkProducts.add(new HotDrinkProduct(160, 2, "Capuchinno", 250, 80));
        hotDrinkProducts.add(new HotDrinkProduct(180, 3, "Latte", 250, 80));

        HotDrinkVendingMachine machine2 = new HotDrinkVendingMachine(hotDrinkProducts);

        System.out.printf("Данный товар стоит %d рублей\n", machine2.getPrice(id2));
        machine2.buyInfo(id2);
        System.out.println(machine2.getProduct(id2));






    }
}
