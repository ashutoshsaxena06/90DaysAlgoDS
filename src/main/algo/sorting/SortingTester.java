package main.algo.sorting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SortingTester {
     int[] unsorted = {20, 90, 70, 30, 50, 100, 40, 110, 80, 60, 10};
     int[] sorted = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

    Sort bubbleSort = new BubbleSort();
    Sort heapSort = new HeapSort();
    Sort mergeSort = new MergeSort();
    Sort insertionSort = new InsertionSort();
    Sort selectionSort = new SelectionSort();

    @Test
    public void can_sort_unsorted_array() {
        Assert.assertArrayEquals(bubbleSort.getClass().getName() + " sorting failed ",
                sorted,
                bubbleSort.sortNumbers(unsorted));
    }
}
