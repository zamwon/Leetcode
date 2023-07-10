package pl.karnecki.leetcode.easy;

import java.util.Set;

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {

        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        char[] charArray = s.toCharArray();

        while (start < end) {

            while (start < end && vowels.indexOf(charArray[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(charArray[end]) == -1) {
                end--;
            }
            // Swap the vowels
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        return new String(charArray);
        }
}
