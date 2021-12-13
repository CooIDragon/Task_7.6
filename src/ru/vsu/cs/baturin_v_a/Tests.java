package ru.vsu.cs.baturin_v_a;

public class Tests {
    public TestResult tests() {
        TestStorage arraysList = new TestStorage();
        TestCase[] arrays = arraysList.getTests();

        for (TestCase array : arrays) {
            int newResult = FindingMaxQuantity.findNumberOfSatisfyingElements(array.getArray());

            if (newResult != array.getResult()) {
                return new TestResult(false);
            }
        }
        return new TestResult(true);
    }
}
