import java.util.ArrayList;
import java.util.List;

import Contacts.Adress;
import Contacts.Contact;
import Contacts.Phone;
import Contacts.Telegram;
import Contacts.VK;
import Model.ContactService;
import Model.Conteragent;
import Presenter.Presenter;
import View.ConsoleView;

public class Main {
    public static void main(String[] args) {

        List<Contact> contacts1 = new ArrayList<>();
        contacts1.add(new Telegram("ivanPtg"));
        contacts1.add(new VK("vk.com/ivanko"));
        contacts1.add(new Phone("892342319"));
        contacts1.add(new Adress("Moscow"));
        Conteragent agent1 = new Conteragent("Ivan Petrovich", contacts1);

        List<Contact> contacts2 = new ArrayList<>();
        contacts2.add(new Telegram("andreevTg"));
        contacts2.add(new VK("vk.com/andro"));
        contacts2.add(new Phone("89232342319"));
        contacts2.add(new Adress("Tula"));

        Conteragent agent2 = new Conteragent("IP Andreev", contacts2);

        List<Contact> contacts3 = new ArrayList<>();
        contacts3.add(new Telegram("svetaTg"));
        contacts3.add(new VK("vk.com/solnce"));
        contacts3.add(new Phone("8452342319"));
        contacts3.add(new Adress("Saratov"));
        Conteragent agent3 = new Conteragent("Mom", contacts3);

        ArrayList<Conteragent> conteragents = new ArrayList<>();
        conteragents.add(agent1);
        conteragents.add(agent2);
        conteragents.add(agent3);

        ContactService model = new ContactService(conteragents);
        ConsoleView view = new ConsoleView(model);

        Presenter presenter = new Presenter(view, model);

        presenter.run();
    }
}
