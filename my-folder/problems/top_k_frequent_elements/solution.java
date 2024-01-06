class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap <>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);  
        }
        ArrayList <Integer> arraylist = new ArrayList<>(map.keySet());
        
        arraylist.sort((a, b) -> map.get(b) - map.get(a));
         int res[] = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = arraylist.get(i);
        return res;
        
    }
}