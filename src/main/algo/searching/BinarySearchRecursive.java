package main.algo.searching;

public class BinarySearchRecursive implements Search {
    /**
     * @param numbers - array to lookup
     * @param target - number to search
     * @return the index of the target if found, else -1
     * space complexity - O(1)
     * time complexity - O(logN) - logN base2
     * */
    @Override
    public int findNumber(int[] numbers, int target) {
        return findNumberRecursive(numbers, target, 0, numbers.length - 1);
    }

    private int findNumberRecursive(int[] nums, int target, int l, int r) {
        if (r < l) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        if (target > nums[mid]) {
            return findNumberRecursive(nums, target, mid + 1, r);
        } else {
            return findNumberRecursive(nums, target, l, mid - 1);
        }
    }
}
