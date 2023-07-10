package pl.karnecki.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> listForIndex0 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> listForIndex1 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());


        Set<Integer> result0 = new HashSet<>();
        Set<Integer> result1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!listForIndex1.contains(nums1[i])) {
                result0.add(nums1[i]);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!listForIndex0.contains(nums2[j])) {
                result1.add(nums2[j]);
            }
        }
        return List.of(result0.stream().toList(), result1.stream().toList());
    }
}
