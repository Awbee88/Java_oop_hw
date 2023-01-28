package Model;

import java.util.List;

import Contacts.Contact;

public class Conteragent implements AbstractConteragent {

    private String name;
    private List<Contact> contacts;

    public Conteragent(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void removeContact(String value) {
        for (Contact contact : contacts) {
            if (contact.getContact().equals(value)) {
                contacts.remove(contact);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Conteragent [name=" + name + ", contacts=" + contacts;
    }

}
