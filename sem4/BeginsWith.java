// в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

public class BeginsWith<T> implements IsGood<String> {

    private String checkText;

    public BeginsWith(String checkText) {
        this.checkText = checkText;
    }

    @Override
    public boolean isGood(String text) {
        return text.startsWith(checkText);
    }

}
