package pl.karnecki.leetcode;

public class StringContainsVowels {
    public static boolean stringContainsVowels(String input) {
        return input.matches(".*[aeiouy].*");
    }
}