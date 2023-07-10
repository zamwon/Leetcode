package pl.karnecki.leetcode;

import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        //O(1)
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mapS = new HashMap<>();

        //O(s)
        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i),
                    mapS.get(s.charAt(i)) + 1);
            } else {
                mapS.put(s.charAt(i), 1);
            }
        }
        //O(t)
        for (int i = 0; i < t.length(); i++) {
            if (mapS.containsKey(t.charAt(i))) {
                mapS.put(t.charAt(i),
                    mapS.get(t.charAt(i)) - 1);
            } else return false;
        }
        Set<Character> characters = mapS.keySet();

        for (char c : characters) {
            if (mapS.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
    //O(s+t)
}
