package grind75;

public class Palindrome {
    //https://leetcode.com/problems/valid-palindrome/description/
    class Solution {
        public boolean isPalindrome(String s) {
            String strUp= s.replaceAll(
                    "[^a-zA-Z0-9]", "");

            String str =strUp.toLowerCase();
            for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    return false;
                }
            }
            return true;

        }
    }
}
