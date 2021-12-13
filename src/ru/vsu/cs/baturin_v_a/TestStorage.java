package ru.vsu.cs.baturin_v_a;

public class TestStorage {
    public TestCase[] getTests() {
        TestCase array1 = new TestCase(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10);
        TestCase array2 = new TestCase(new int[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 0}, 5);
        TestCase array3 = new TestCase(new int[]{1, 11, 111, 1111, 11111, 111111, 1111111, 11111111, 111111111}, 1);
        TestCase array4 = new TestCase(new int[]{10, 11, 12, 13, 13, 12, 12, 11, 11, 11}, 3);
        TestCase array5 = new TestCase(new int[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, 1);
        TestCase array6 = new TestCase(new int[]{111, 1, 11, 111, 1, 11, 1, 111, 1, 11}, 1);
        TestCase array7 = new TestCase(new int[]{1, 3, 3, 3, 4, 4, 4, 1, 1, 1}, 3);
        TestCase array8 = new TestCase(new int[]{100, 100, 100, 10000, 10000, 10, 10, 10, 10, 10}, 5);
        TestCase array9 = new TestCase(new int[]{4, 4, 4, 4, 2, 1, 0, -100, -39, 12, 10, 11}, 4);
        TestCase array10 = new TestCase(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 1);

        return new TestCase[]{array1, array2, array3, array4, array5, array6, array7, array8, array9, array10};
    }
}
