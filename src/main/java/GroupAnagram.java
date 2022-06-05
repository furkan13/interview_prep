


//Leetcode problem 49
//Group Anagram
//String/ HashMap (Medium)



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> newMap=new HashMap<>();


            for(String s:strs)
            {
                int [] count=new int[26];
                for(char c:s.toCharArray())
                {
                    count[c-'a']++;
                }



                StringBuilder sb =new StringBuilder();
                for(int i=0;i<26;i++)
                {
                    sb.append(count[i]);
                    sb.append('#');

                }

                String key =sb.toString();



                newMap.putIfAbsent(key , new ArrayList<>());
                newMap.get(key).add(s);
            }

            return new ArrayList<>(newMap.values());


        }
    }


}
