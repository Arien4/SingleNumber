package practice;

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
// You must implement a solution with a linear runtime complexity and use only constant extra space.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0, 5, 7, 7, 6, -5, 6, -5, 5, 0, 9, 8, 8};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length - 1; i += 2) if (nums[i] != nums[i + 1]) return nums[i];
        return nums[nums.length - 1];
    }
}
