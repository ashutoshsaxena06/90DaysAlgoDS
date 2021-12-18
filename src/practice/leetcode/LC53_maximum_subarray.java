package practice.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC53_maximum_subarray {

    public int maxSumContiguousSubArray(int[] arr) {

        if (arr == null || arr.length < 1) {
            return 0;
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);

            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    @Test
    public void test1() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, maxSumContiguousSubArray(input));
    }

    @Test
    public void test2() {
        int[] input = {};
        Assertions.assertEquals(0, maxSumContiguousSubArray(input));
    }

    @Test
    public void test3() {
        int[] input = {2};
        Assertions.assertEquals(2, maxSumContiguousSubArray(input));
    }

    @Test
    public void test4() {
        int[] input = {-2, 1, 5, 5};
        Assertions.assertEquals(11, maxSumContiguousSubArray(input));
    }
}
