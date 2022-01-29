package main.algo.searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LinearSearch {
    int[] unsortedArray = {1, 16, -1, 16, 18, 20, 99};
    int[] sortedArray = {-10, 0, 10, 20, 30, 40, 50, 60};

    public int findNumber(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void target_exist_in_unsortedArray() {
        Assert.assertEquals(-1, findNumber(unsortedArray, 55)); // not exists
    }

    @Test
    public void target_does_not_exist_in_unsortedArray() {
        int[] unsortedArray = {1, 16, -1, 16, 18, 20, 99};
        Assert.assertEquals(-1, findNumber(unsortedArray, 55)); // not exists
    }

    @Test
    public void target_exist_in_sortedArray() {
        Assert.assertEquals(5, findNumber(sortedArray, 40)); // exists
    }

    @Test
    public void target_does_not_exist_in_sortedArray() {
        Assert.assertEquals(-1, findNumber(sortedArray, 55)); // not exists
    }
}
