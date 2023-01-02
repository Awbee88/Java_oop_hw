import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        IsGood<Integer> even1 = new IsEven<>();
        if (even1.isGood(num1)) {
        System.out.println("Элемент прошел проверку");
        System.out.println(num1);
        } else {
        System.out.println("Элемент не прошел проверку");
        }
        System.out.println("----------------");

        int num2 = -45;
        IsGood<Integer> positive1 = new IsPositive<>();
        if (positive1.isGood(num2)) {
        System.out.println("Элемент прошел проверку");
        System.out.println(num2);
        } else {
        System.out.println("Элемент не прошел проверку");
        }
        System.out.println("----------------");

        int num3 = 45;
        IsGood<Integer> positive2 = new IsPositive<>();
        if (positive2.isGood(num3)) {
        System.out.println("Элемент прошел проверку");
        System.out.println(num3);
        } else {
        System.out.println("Элемент не прошел проверку");
        }
        System.out.println("----------------");

        String text1 = "Asia";
        IsGood<String> checkText1 = new BeginsWithA<>();
        if (checkText1.isGood(text1)) {
        System.out.println("Элемент прошел проверку");
        System.out.println(text1);
        } else {
        System.out.println("Элемент не прошел проверку");
        }
        System.out.println("----------------");

        String text2 = "blockchain";
        IsGood<String> checkText2 = new BeginsWith<>("block");
        if (checkText2.isGood(text2)) {
        System.out.println("Элемент прошел проверку");
        System.out.println(text2);
        } else {
        System.out.println("Элемент не прошел проверку");
        }
        System.out.println("----------------");

        // Проверяем коллекции 1
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 44, 53, 1234, -8, -10));
        System.out.println(numbers);
        IsGood<Integer> approverNums = new IsPositive<>();
        Iterable<Integer> newNumbers = filter(numbers, approverNums);
        System.out.println(newNumbers);
        System.out.println("----------------");

        // Проверяем коллекции 2

        List<String> words = new ArrayList<>(Arrays.asList("blockchain", "blockpost", "block1", "China", "Moscow"));
        System.out.println(words);
        IsGood<String> approverText = new BeginsWith<>("block");
        Iterable<String> newWords = filter(words, approverText);
        System.out.println(newWords);
        System.out.println("----------------");

    }

    public static <T> Iterable<T> filter(Iterable<T> collection, IsGood<T> approver) {

        List<T> newCollection = new ArrayList<>();
        for (T t : collection) {
            if (approver.isGood(t)) {
                newCollection.add(t);
            }
        }

        return (Iterable<T>) newCollection;
    }

}
