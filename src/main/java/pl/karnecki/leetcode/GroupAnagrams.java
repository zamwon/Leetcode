package pl.karnecki.leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        // strs = {"pop","bat","tab","opp"};
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {

            // str = "p", "o", "p"
            char[] str = strs[i].toCharArray();

            Arrays.sort(str);

            String s = String.valueOf(str); // str =  "o", "p", "p" -> s = "opp"

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
                map.get(s).add(strs[i]); // <"opp"; List.of{"pop"{}>
        }
        return new ArrayList<>(map.values());
    }
}
