package pl.karnecki.leetcode.medium;

public class ReverseWordsInaString {
    public String reverseWords(String s) {

        String[] trimAndSplit = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = trimAndSplit.length - 1; i >= 0; i--) {
                sb.append(trimAndSplit[i]);
        }
        return sb.toString().trim();
    }
}
