package main.algo.searching;

public class BinarySearchIterative implements Search {

    /**
     * @param nums - array to lookup
     * @param target - number to search
     * @return the index of the target if found, else -1
     * space complexity - O(1)
     * time complexity - O(logN) - logN base2
     * */
    @Override
    public int findNumber(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
