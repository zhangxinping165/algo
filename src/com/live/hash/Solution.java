package com.live.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和最优解
 * @author zhangxinping
 */
public class Solution {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        System.out.println(Arrays.toString(twoSum(a,12)));
    }

}


