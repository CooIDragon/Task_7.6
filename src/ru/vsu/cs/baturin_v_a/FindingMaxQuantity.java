package ru.vsu.cs.baturin_v_a;

public class FindingMaxQuantity {
    public static int findNumberOfSatisfyingElements(int[] array) {
        int counterMax = 1;
        int counter = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array [i - 1]) {
                counter += 1;
                if (counter > counterMax) {
                    counterMax = counter;
                }
            } else {
                counter = 1;
            }
        }
        return counterMax;
    }
}
