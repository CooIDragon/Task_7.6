package ru.vsu.cs.baturin_v_a;

import org.junit.Assert;
import org.junit.Test;

public class TestFindingMaxQuantity {

    @Test
    public void testArray1() {
        int[] testingArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int expectedResult = 10;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray2() {
        int[] testingArray = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        int expectedResult = 5;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray3() {
        int[] testingArray = {1, 11, 111, 1111, 11111, 111111, 1111111, 11111111, 111111111};
        int expectedResult = 1;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray4() {
        int[] testingArray = {10, 11, 12, 13, 13, 12, 12, 11, 11, 11};
        int expectedResult = 3;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray5() {
        int[] testingArray = {-1, 1, -1, 1, -1, 1, -1, 1, -1, 1};
        int expectedResult = 1;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray6() {
        int[] testingArray = {111, 1, 11, 111, 1, 11, 1, 111, 1, 11};
        int expectedResult = 1;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray7() {
        int[] testingArray = {1, 3, 3, 3, 4, 4, 4, 1, 1, 1};
        int expectedResult = 3;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray8() {
        int[] testingArray = {100, 100, 100, 10000, 10000, 10, 10, 10, 10, 10};
        int expectedResult = 5;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray9() {
        int[] testingArray = {4, 4, 4, 4, 2, 1, 0, -100, -39, 12, 10, 11};
        int expectedResult = 4;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void testArray10() {
        int[] testingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int expectedResult = 1;
        int factualResult = FindingMaxQuantity.findNumberOfSatisfyingElements(testingArray);

        Assert.assertEquals(expectedResult, factualResult);
    }
}