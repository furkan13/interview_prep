package grind75;

import java.util.ArrayList;
import java.util.HashMap;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequent {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap <>();
            for (int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            ArrayList<Integer> arraylist = new ArrayList<>(map.keySet());

            arraylist.sort((a, b) -> map.get(b) - map.get(a));
            int res[] = new int[k];
            for (int i = 0; i < k; ++i)
                res[i] = arraylist.get(i);
            return res;

        }
    }
}
