package main.algo.searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SearchTester {
    int[] unsortedArray = {1, 16, -1, 16, 18, 20, 99};
    int[] sortedArray = {0, 5, 10, 20, 30, 40, 50, 60};

    Search linearSearch = new LinearSearch();
    Search binarySearchIterative = new BinarySearchIterative();
    Search binarySearchRecursive = new BinarySearchRecursive();

    @Test
    public void target_exist_in_unsortedArray() {
        int expected = 5;
        int target = 20;
        Assert.assertEquals(linearSearch.getClass().getName() + " search failed " + unsortedArray,
                expected,
                linearSearch.findNumber(unsortedArray, target)); // not exists
    }

    @Test
    public void target_does_not_exist_in_unsortedArray() {
        int expected = -1;
        int target = 46;
        Assert.assertEquals(linearSearch.getClass().getName() + " search failed " + unsortedArray,
                expected,
                linearSearch.findNumber(unsortedArray, target)); // not exists
    }

    @Test
    public void target_exist_in_sortedArray() {
        int expected = 5;
        int target = 40;
        Assert.assertEquals(linearSearch.getClass().getName() + " search failed " + sortedArray,
                expected,
                linearSearch.findNumber(sortedArray, target)); // not exists

        Assert.assertEquals(binarySearchIterative.getClass().getName() + " search failed ",
                expected,
                binarySearchIterative.findNumber(sortedArray, target)); // not exists

        Assert.assertEquals(binarySearchRecursive.getClass().getName() + " search failed ",
                expected,
                binarySearchRecursive.findNumber(sortedArray, target)); // not exists
    }

    @Test
    public void target_does_not_exist_in_sortedArray() {
        int expected = -1;
        int target = 46;
        Assert.assertEquals(linearSearch.getClass().getName() + " search failed ",
                expected,
                linearSearch.findNumber(sortedArray, target)); // not exists

        Assert.assertEquals(binarySearchIterative.getClass().getName() + " search failed ",
                expected,
                binarySearchIterative.findNumber(sortedArray, target)); // not exists

        Assert.assertEquals(binarySearchRecursive.getClass().getName() + " search failed ",
                expected,
                binarySearchRecursive.findNumber(sortedArray, target)); // not exists    }
    }
}