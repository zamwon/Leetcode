package pl.karnecki.leetcode;

import java.util.Objects;

public class PalindromeNumber {
//123
    public boolean isPalindrome(int x) {

        String xAsString = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = String.valueOf(x).length() - 1; i >= 0 ; i--) {
            sb.append(xAsString.charAt(i));
        }

        return Objects.equals(xAsString, sb.toString());
    }
}
