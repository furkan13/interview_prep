class Solution {
    public int maxArea(int[] height) {
        int com=Integer.MIN_VALUE;
        int res=0;
        for(int i=0,j=(height.length-1);i<height.length;)
        {
            int x=height.length-(height.length-j)-i;
            System.out.println(j);
            int y1=height[i];
            int y2=height[j];
            if(y1>y2)
            {
                int arr=x*y2;
               com=Math.max(arr,com);
                j--;

            }
            else
            {
                int arr=x*y1;
                com=Math.max(arr,com);
                i++;
            }

        }
        return com;
        
    }
}