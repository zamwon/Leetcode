package pl.karnecki.leetcode;

import java.util.List;

public class OnlyOddNumbers {
    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }

        return true;
    }

    public static boolean onlyOddNumbersHugeList(List<Integer> list) {
        return list
            .parallelStream() // parallel stream for faster processing
            .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
    }
}
