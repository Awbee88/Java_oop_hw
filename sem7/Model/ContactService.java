package Model;

import java.util.ArrayList;
import java.util.List;

import Contacts.Adress;
import Contacts.Contact;
import Contacts.Email;
import Contacts.Phone;
import Contacts.Telegram;
import Contacts.VK;

public class ContactService implements Service {
    private ArrayList<Conteragent> conteragents;

    public ContactService(ArrayList<Conteragent> conteragents) {
        this.conteragents = conteragents;
    }

    @Override
    public void addConteragent(String agentName) {
        List<Contact> newContacts = new ArrayList<>();
        Conteragent newAgent = new Conteragent(agentName, newContacts);
        conteragents.add(newAgent);
    }

    @Override
    public void removeConteragent(String agentName) {
        for (Conteragent conteragent : conteragents) {
            if (conteragent.getName().equals(agentName)) {
                conteragents.remove(conteragent);
            }
        }
    }

    @Override
    public void addContactService(String agentName, int contactNum, String contactValue) {
        for (Conteragent conteragent : conteragents) {
            if (conteragent.getName().equals(agentName)) {
                Contact newContact;
                switch (contactNum) {
                    case 1:
                        newContact = new Adress(contactValue);
                        conteragent.addContact(newContact);
                        break;
                    case 2:
                        newContact = new Email(contactValue);
                        conteragent.addContact(newContact);
                        break;
                    case 3:
                        newContact = new Phone(contactValue);
                        conteragent.addContact(newContact);
                        break;
                    case 4:
                        newContact = new Telegram(contactValue);
                        conteragent.addContact(newContact);
                        break;
                    case 5:
                        newContact = new VK(contactValue);
                        conteragent.addContact(newContact);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }
    }

    @Override
    public void removeContactService(String agentName, int contactNum, String contactValue) {
        for (Conteragent conteragent : conteragents) {
            if (conteragent.getName().equals(agentName)) {
                switch (contactNum) {
                    case 1:
                        conteragent.removeContact(contactValue);
                        break;
                    case 2:
                        conteragent.removeContact(contactValue);
                        break;
                    case 3:
                        conteragent.removeContact(contactValue);
                        break;
                    case 4:
                        conteragent.removeContact(contactValue);
                        break;
                    case 5:
                        conteragent.removeContact(contactValue);
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }

            }
        }
    }

    public List<Conteragent> getConteragents() {
        return conteragents;
    }

}
