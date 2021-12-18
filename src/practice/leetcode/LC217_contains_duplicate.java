package practice.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/

public class LC217_contains_duplicate {

    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <1){
            return false;
        }

        Set<Integer> numberSet = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(numberSet.contains(nums[i]))
                return true;
            numberSet.add(nums[i]);
        }
        return false;
    }

    @Test
    public void test1() {
        int[] input = {};
        Assertions.assertEquals(false, containsDuplicate(input));
    }

    @Test
    public void test2() {
        int[] input = {2};
        Assertions.assertEquals(false, containsDuplicate(input));
    }

    @Test
    public void test3() {
        int[] input = {2,2,2,2};
        Assertions.assertEquals(true, containsDuplicate(input));
    }

    @Test
    public void test4() {
        int[] input = {1,2,3,4};
        Assertions.assertEquals(false, containsDuplicate(input));
    }

    @Test
    public void test5() {
        int[] input = {1,2,3,4,1};
        Assertions.assertEquals(true, containsDuplicate(input));
    }
}