package View;

import Model.ContactService;
import Model.Conteragent;

public class ConsoleView implements View {

    private ContactService model;

    public ConsoleView(ContactService model) {
        this.model = model;
    }

    @Override
    public void printAllConteragents() {
        for (Conteragent agent : model.getConteragents()) {
            System.out.println(agent);
        }

    }

    @Override
    public void findContragent(String agentName) {
        for (Conteragent agent : model.getConteragents()) {
            if (agent.getName().equals(agentName)) {
                System.out.println(agent);
            }
        }
    }

    public void showMenu() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Введите 1, чтобы распечатать список контрагентов");
        System.out.println("Введите 2, чтобы найти контрагента по названию. Посмотреть подробную информацию о нём");
        System.out.println("Введите 3, чтобы добавить контрагента");
        System.out.println("Введите 4, чтобы удалить контрагента");
        System.out.println("Введите 5, чтобы добавить новый способ связаться с контрагентом");
        System.out.println("Введите 6, чтобы удалить способ связаться с контрагентом");
        System.out.println("Введите 0, чтобы завершить программу");
        System.out.println("-------------------------------------------------------------------------------");
    }

}
