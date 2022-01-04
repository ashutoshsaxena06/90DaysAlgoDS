package main.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//https://leetcode.com/problems/merge-sorted-array/
class LC88_merge_sorted_array {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int z = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[z--] = nums1[i--];
            } else {
                nums1[z--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[z--] = nums2[j--];
        }
        return nums1;
    }

    @Test
    public void test() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] expected = {1, 2, 2, 3, 5, 6};
        Assertions.assertArrayEquals(expected, merge(nums1, m, nums2, n));
    }

    @Test
    public void test1() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        int[] expected = {1};
        Assertions.assertArrayEquals(expected, merge(nums1, m, nums2, n));
    }

    @Test
    public void test2() {
        int[] nums1 = {2};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] expected = {2};
        Assertions.assertArrayEquals(expected, merge(nums1, m, nums2, n));
    }

}