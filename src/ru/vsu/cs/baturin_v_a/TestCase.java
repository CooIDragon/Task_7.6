package ru.vsu.cs.baturin_v_a;

public class TestCase {
    final int[] array;
    final int result;

    public TestCase(int[] array, int result) {
        this.array = array;
        this.result = result;
    }

    public int[] getArray() {
        return array;
    }

    public int getResult() {
        return result;
    }
}
