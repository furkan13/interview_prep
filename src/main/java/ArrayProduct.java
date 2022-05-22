
//Leetcode problem 238
//Product of Array Except Self
//Array (Medium)



public class ArrayProduct {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] forwardProduct=new int [nums.length];
            int[] backProduct=new int[nums.length];
            int[] out=new int[nums.length];
            forwardProduct [0]=nums[0];
            backProduct [nums.length-1]=nums[nums.length-1];



            for(int i=1, j=nums.length-2;i<nums.length;i++,j--)
            {
                forwardProduct [i]=forwardProduct [i-1]*nums[i];
                //System.out.println( forwardProduct [i]);

                backProduct[j]=backProduct[j+1]*nums[j];
                System.out.println( backProduct [j]);
            }


            for(int i=0;i<nums.length;i++)
            {
                if(i==0)
                {
                    out[i]=backProduct[i+1];

                }
                else if(i==nums.length-1)
                {
                    out[i]=forwardProduct[i-1];
                }

                else
                {
                    out[i]=backProduct[i+1]*forwardProduct[i-1];
                }
            }






            return out;
        }




    }




}
