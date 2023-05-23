import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Find all anagram from a string
//438
// Sliding technique,String,Anagram
public class AllAnagram {



        public static List<Integer> findAnagrams(String s, String p) {


            if(p.length()>s.length()) return new ArrayList();

            int []chars =new int[26];
            int []sChars=new int [26];
            int total=0;
            for(char c:p.toCharArray())
            {
                chars[c-'a']++; //creating the array of char for string p


            }

            List<Integer> output = new ArrayList();


            for(int i=0;i<s.length();++i)
            {
                sChars[s.charAt(i)-'a']++;  // adding the char for string s

                if(i>=p.length())           //if string s contain more char than p
                {
                    sChars[s.charAt(i-p.length())-'a']--;  //remove the first char of string s
                                                            // 3-3=0; 4-3=1


                }

                if(Arrays.equals(chars,sChars))   //check if the array equal
                {

                    output.add(i-(p.length()-1));   // get the location of the char // last index of s anagram - size of p -1

                }


            }

            return output;



        }




}
