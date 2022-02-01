package main.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LC409_longest_palindrome {

    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = 0;
        for (char ch : s.toCharArray()) {
            if (++count[ch] == 2) {
                length += 2;
                count[ch] = 0;
            }
        }
        return length == s.length() ? s.length() : length + 1;
    }

    @Test
    public void test_longest_palindrome() {
        Assert.assertEquals(5, longestPalindrome("nitin"));
        Assert.assertEquals(7, longestPalindrome("abccccdd"));
        Assert.assertEquals(7, longestPalindrome("aabbccc"));
        Assert.assertEquals(1, longestPalindrome("a"));
        Assert.assertEquals(4, longestPalindrome("aabb"));
    }
}
