class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s{2,}", " ");
        String[] news = s.split(" ");
        for(int i=0;i<news.length;i++)
        {
            System.out.println(news[i]);
        }
        String temp="";
        int l =news.length;


        for(int i=l-1;i>=0;i--)
        {

            if(!news[i].equals(" "))
            {
            if(i!=0) {
                
                temp = temp + news[i] + " ";
            }
            else
            {
                temp = temp + news[i];
            }}

        }
       
        temp.trim();
        
        
        return temp;
    }
}