package pl.karnecki.leetcode;

import java.util.HashSet;

public class FindDuplicates {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> distinctNumbers = new HashSet<>();

        for (int num : nums) {
            if (distinctNumbers.contains(num)) {
                return true;
            }
            distinctNumbers.add(num);
        }
        return false;
    }
}
