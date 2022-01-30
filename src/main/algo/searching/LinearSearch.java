package main.algo.searching;

public class LinearSearch implements Search {

    /**
     * @param numbers - array to lookup
     * @param target - number to search
     * @return the index of the target if found, else -1
     * space complexity - O(1)
     * time complexity - O(n)
     * */
    @Override
    public int findNumber(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
