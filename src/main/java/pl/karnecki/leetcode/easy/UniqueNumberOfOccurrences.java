package pl.karnecki.leetcode.easy;

import java.util.*;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
            map.put(arr[i], map.getOrDefault(arr[i], 1));
            }
            map.put(arr[i], map.get(arr[i]) + 1);
        }

        Set<Integer> result = new HashSet<>(map.values());

        // If all elements are distinct, size of
        // HashSet should be same array.
        return (result.size() == map.values().size());

    }
}
