// ему дают целое число, он одобряет его, если оно чётное

public class IsEven<T> implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer number) {
        return number % 2 == 0;
    }

}