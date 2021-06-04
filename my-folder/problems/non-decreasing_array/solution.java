class Solution {
    public boolean checkPossibility(int[] nums) {
           int count=0;
        boolean bool =true;
        int l=nums.length;
        int max=-1;
        int i=0;
        for (;i<=l-2;)

        {
            if(nums[i]>nums[i+1])
            {




              
                if(l-1-i>=2) {

                    if (nums[i] > nums[i + 2]) {
                       
                        nums[i] = nums[i + 1] ;


                    } else {
                        nums[i + 1] = nums[i];


                    }
                }
                 else
                {
                   nums[i+1]=nums[i];
                }
               
                i=0;
                count++;


            }
            else
            {
                i++;
            }




            if (count>1)
            {
                bool=false;
                break;
            }



        }
       
        return bool;

        
            
            
    }
}