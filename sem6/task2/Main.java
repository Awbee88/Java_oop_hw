package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(523);
        nums.add(23);
        nums.add(34);

        ImmutableList<Integer> numsImm = new ImmutableList<>(nums);
        System.out.println(numsImm.getSize());
        System.out.println(numsImm.get(2));

        MutableList<Integer> numsMut = new MutableList<>(nums);
        numsMut.add(255);
        numsMut.add(2145);
        numsMut.set(0, 123);
        numsMut.set(2, 214);
        System.out.println(numsMut.getSize());

    }
}
