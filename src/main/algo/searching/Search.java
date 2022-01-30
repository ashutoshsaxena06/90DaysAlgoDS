package main.algo.searching;

public interface Search {

    /**
     * @param numbers - array to lookup
     * @param target - number to search
     * @return the index of the target if found, else -1
     */
    int findNumber(int [] numbers, int target);
}
