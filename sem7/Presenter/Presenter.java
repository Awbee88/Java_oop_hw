package Presenter;

import java.util.Scanner;

import Model.Service;
import View.View;

public class Presenter {
    private View view;
    private Service model;

    public Presenter(View view, Service model) {
        this.view = view;
        this.model = model;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isOk = true;
        int menuItem;
        while (isOk) {
            view.showMenu();
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    view.printAllConteragents();
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    String tempAgent;
                    System.out.println("Введите имя Контрагента: ");
                    tempAgent = sc2.nextLine();
                    view.findContragent(tempAgent);
                    break;
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    String addAgent;
                    System.out.println("Введите имя Контрагента, чтобы добавить его в список Контактов: ");
                    addAgent = sc3.nextLine();
                    model.addConteragent(addAgent);
                    break;
                case 4:
                    Scanner sc4 = new Scanner(System.in);
                    String removeAgent;
                    System.out.println("Введите имя Контрагента, чтобы удалить его из списка Контактов: ");
                    removeAgent = sc4.nextLine();
                    model.removeConteragent(removeAgent);
                    break;
                case 5:
                    Scanner sc5 = new Scanner(System.in);
                    Scanner sc52 = new Scanner(System.in);
                    String addContact;
                    int contactNum;
                    String contactValue;
                    System.out.println("Введите имя Контрагента, которому необходимо добваить новый способ связи: ");
                    addContact = sc5.nextLine();
                    System.out.println(
                            "Введите порядковый номер способа связи (1- Adress, 2- Email, 3- Phone, 4 - Telegram, 5 - Vk): ");
                    contactNum = sc5.nextInt();
                    System.out.println("Введите значение для нового способа связи: ");
                    contactValue = sc52.nextLine();
                    model.addContactService(addContact, contactNum, contactValue);
                    break;
                case 6:
                    Scanner sc6 = new Scanner(System.in);
                    Scanner sc62 = new Scanner(System.in);
                    String removeContact;
                    int contactNum2;
                    String contactValue2;
                    System.out.println("Введите имя Контрагента, которому необходимо удалить способ связи: ");
                    removeContact = sc6.nextLine();
                    System.out.println(
                            "Введите порядковый номер способа связи для удаления (1- Adress, 2- Email, 3- Phone, 4 - Telegram, 5 - Vk): ");
                    contactNum2 = sc6.nextInt();
                    System.out.println("Введите значение, которое необходимо удалить: ");
                    contactValue2 = sc62.nextLine();
                    model.removeContactService(removeContact, contactNum2, contactValue2);
                    break;
                case 0:
                    isOk = false;
                    break;

                default:
                    System.out.println("Что-то пошло не так!");
            }
        }
        sc.close();
    }
}
