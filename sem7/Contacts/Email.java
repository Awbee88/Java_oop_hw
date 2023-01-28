package Contacts;
public class Email extends Contact {

    public Email(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Email [" + value + "]";
    }
    
}
