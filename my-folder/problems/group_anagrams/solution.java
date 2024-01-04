class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String,List<String>> dic=new HashMap<>();
        for(String s:strs )
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String sortedWord=new String(chars);
            if(!dic.containsKey(sortedWord))
            {
                dic.put(sortedWord,new ArrayList<>());

            }
            dic.get(sortedWord).add(s);
           
        }
        return new ArrayList<>(dic.values());

        
        
    }

}