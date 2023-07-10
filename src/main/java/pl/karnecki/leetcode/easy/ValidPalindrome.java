package pl.karnecki.leetcode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String formatedString = s.toLowerCase().replaceAll("[^a-zA-Z\\d]", "");

        StringBuilder sb = new StringBuilder();
        for (int i = formatedString.length() - 1; i >= 0; i--) {
            sb.append(formatedString.charAt(i));
        }
        String result = sb.toString();

        return result.equals(formatedString);
    }
}
