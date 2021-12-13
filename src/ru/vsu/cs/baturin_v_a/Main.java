package ru.vsu.cs.baturin_v_a;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Tests tests = new Tests();
        TestResult testResult = tests.tests();

        if (testResult.getTestResult()) {
            System.out.println("All tests completed!");

            int[] array = new int[readLengthOfArray()];
            readArray(array);

            System.out.println(FindingMaxQuantity.findNumberOfSatisfyingElements(array));
        } else {
            System.out.println("Error: test is not completed");
        }
    }

    private static int readLengthOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array: ");

        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Error, length > 0");
            length = readLengthOfArray();
        }

        return length;
    }

    private static void readArray(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Input %d element of array: ", (i + 1));
            array[i] = scanner.nextInt();
        }
    }
}
