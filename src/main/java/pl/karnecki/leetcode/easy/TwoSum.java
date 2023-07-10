package pl.karnecki.leetcode.easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//[3,2,4] target = 6
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i]; // 6 - 3 = 3 // 6-2 = 4 // 6 - 4 = 2
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
