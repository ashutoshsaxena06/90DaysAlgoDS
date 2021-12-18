package practice.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LC1_two_sum {

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length<1){
            return new int[0];
        }
        int[] result = new int[2];

        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(numMap.containsKey(complement)){
                result[0] = numMap.get(complement);
                result[1] = i;
                break;
            }
            numMap.put(nums[i], i);
        }
        return result;
    }

    @Test
    public void test(){
        int [] input = {2,7,11,15};
        int target = 9;
        int [] expected = {0,1};
        Assertions.assertArrayEquals(expected, twoSum(input,target));
    }

    @Test
    public void test1(){
        int [] input = {3,2,4};
        int target = 6;
        int [] expected = {1,2};
        Assertions.assertArrayEquals(expected, twoSum(input,target));
    }

    @Test
    public void test2(){
        int [] input = {3,3};
        int target = 6;
        int [] expected = {0,1};
        Assertions.assertArrayEquals(expected, twoSum(input,target));
    }

    @Test
    public void test3(){
        int [] input = {};
        int target = 0;
        int [] expected = {};
        Assertions.assertArrayEquals(expected, twoSum(input,target));
    }
}
