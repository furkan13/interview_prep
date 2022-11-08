import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {

     static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j <s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {

                    i = Math.max(map.get(s.charAt(j)), i); // changing the i value to point the new position as that i is moving forward


                }
                ans = Math.max(ans, j - i + 1);


                map.put(s.charAt(j), j + 1); // keeping the location of the new char
            }
            return ans;
        }



    }

    public static void main(String[] args) {

        System.out.println(Solution.lengthOfLongestSubstring("abcdazxypqr"));
    }

}
