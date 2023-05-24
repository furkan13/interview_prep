package grind75;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/

public class Valid_Parentheses {
    class Solution {
        public boolean isValid(String s) {
            char[] ch = s.toCharArray();
            Stack<Character> queue = new Stack<>();
            HashMap<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');
            if (s.length() < 2) {
                return false;
            }

            for (char c : ch) {
                if (c == '(' || c == '{' || c == '[') {
                    queue.push(c);
                } else {
                    if (!queue.empty()) {
                        if (map.get(c) == queue.peek()) {
                            queue.pop();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }

                }
            }

            return queue.empty();


        }
    }
}
