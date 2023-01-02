// ему дают строку, он одобряет её, если она начинается с буквы A

public class BeginsWithA<T> implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("A");
    }

}