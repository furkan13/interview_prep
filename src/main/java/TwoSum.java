import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap <Integer, int []> set =new HashMap<>();

            int value=0;
            int i=0;
            int []result=new int[2];
            ArrayList <Integer> list=new ArrayList<>();

           while ( true)


           {
               if(value<target)
               {
                   value=value+nums[i];
                   list.add(nums[i]);
                   i++;
               }
               else if (value>target)
               {
                   value=value-list.get(0);
                   list.remove(0);
               }
               else
               {
                   for(int j=0;j<list.size();j++)
                   {
                       result[i]=list.get(i);


                   }
                   return result;

               }
           }








        }


        public int calculate(int i,int[] nums)
        {

                return nums[i]+nums[i+1];

        }



    }
}
