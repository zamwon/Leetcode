package pl.karnecki.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;

        for (int number : nums) {
            if (!set.contains(number - 1)) {
                int length = 0;
                while (set.contains(number + length)) {
                    length++;
                }
                longest = Integer.max(longest, length);
            }
        }
        return longest;
    }
}
