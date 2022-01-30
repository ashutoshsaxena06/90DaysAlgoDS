package main.algo.sorting;

import java.util.Arrays;

public class BubbleSort implements Sort {
    /**
     * @param unsorted - array to sort
     * @return sorted array - non decreasing order
     * space complexity - O(1)
     * time complexity - O(n^2)
     */
    @Override
    public int[] sortNumbers(int[] unsorted) {
        // each outer loop iteration gives biggest number at the end of the array 1->n-1
        for (int i = 1; i <= unsorted.length -1; i++) {
            // compare each number(j) with it's next number(j+1) and if j+1 is smaller -> swap
            for (int j = 0; j < unsorted.length - i; j++) {
                if (unsorted[j+1] < unsorted[j]){
                    int temp = unsorted[j+1];
                    unsorted[j+1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        Arrays.stream(unsorted).forEach(System.out::println);
        return unsorted;
    }
}

// i=1
// 100 50 20 90 - j=0
// 50 100 20 90 - j=1
// 50 20 100 90 - j=2
// 50 20 90 |100 - j=3

// i=2
// 50 20 90 |100 - j=0
// 20 50 90 |100 - j=1
// 20 50 |90 100 - j=1

// i=3 no swap needed, bad example :( for this sorting
// 20 50 |90 100 - j=0
// 20 50 90 100 - j=1
