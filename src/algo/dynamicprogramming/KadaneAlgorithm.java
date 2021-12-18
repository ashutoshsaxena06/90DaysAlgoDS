package algo.dynamicprogramming;

public class KadaneAlgorithm {
//    https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm

    int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // consider an array

    public int maximum_subarray_problem() {
        // initialize 2 variables with 1st value from the array
        int currentSum = numbers[0]; // to hold the current of sub array
        int maxSum = numbers[0]; // final sum

        for (int n : numbers) {
            currentSum = Math.max(currentSum + n, n); // compare currentArray sum with nth number, ex. compare [-2,1] and [1] in this case drop the array and use [1]
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

 /* run down of the above using {-2, 1, -3, 4, -1, 2, 1, -5, 4}
    1st iteration
    n = 1
    currentSum = [-2 + 1] , n = 1 => [1]
    maxSum = [0], currentSum => currentSum =[1]
     2nd iteration
    n= -3
    currentSum = [1 + -3] , n = -3 => [-2]
    maxSum = [1], currentSum => [1]
     3rd iteration
    n = 4
    currentSum = [-2 + 4] , n = 4 => [4]
    maxSum = [1], currentSum => currentSum =[4]
     4th iteration
    n = -1
    currentSum = [4 + -1] , n = -1 => [3]
    maxSum = [1], currentSum => [3], contiguous subarray = [4, −1]
    5th iteration
    n = 2
    currentSum = [3 + 2] , n = 2 => [5]
    maxSum = [3], currentSum => [5], contiguous subarray = [4, −1, 2]
    .
    .
     finally = maxSum = 6 and contiguous subarray = [4, −1, 2, 1]
     */
}
