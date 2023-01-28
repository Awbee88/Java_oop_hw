package Contacts;

public abstract class Contact {
    protected String value;

    
    public Contact(String value) {
        this.value = value;
    }


    public String getContact() {
        return value;
    };
}
