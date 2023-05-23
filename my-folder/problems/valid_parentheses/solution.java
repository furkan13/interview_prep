class Solution {
    public boolean isValid(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> queue=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
         map.put('}','{');
          map.put(']','[');
          if(s.length()<2)
          {
              return false;
          }
         

        for(char c:ch)
        {
            if(c=='('|| c=='{' || c=='[')
            {
                queue.push(c);
                
              


            }
            else
            {
                if(!queue.empty())
                {
                if(map.get(c)==queue.peek())
                {
                   
                    queue.pop();
                }
                else
                {
                    return false;
                }
                }
                else
                {
                    return false;
                }

            }
        } 
          
        if(queue.size()>0)
        {
          
            return false;
        }
        return true;
        
    }
}