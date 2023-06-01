package grind75;
//https://leetcode.com/problems/valid-anagram/submissions/961807533/
public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }
        int[] chars = new int[26];
        int[] sChars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
            //System.out.println(chars[c-'a']);
        }
        for (char c : t.toCharArray()) {
            sChars[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {


            if (chars[i] != sChars[i]) {
                return false;
            }
        }
        return true;


    }
}
