package pl.karnecki.leetcode;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    /*If i reaches end of s1,that mean we found all
        characters of s1 in s2,
        so s1 is subsequence of s2, else not
    Input: s = "abc", t = "ahbgdc"
    Output: true


        */
}
