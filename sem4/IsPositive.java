// ему дают целое число, он одобряет его, если оно положительное

public class IsPositive<T> implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer number) {
        return number > 0;
    }

}