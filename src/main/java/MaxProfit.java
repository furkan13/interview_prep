
//Leetcode problem 121
//Best Time to Buy and Sell Stock
//Array (Easy)



public class MaxProfit { }

class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<=buy)
            {
                buy=prices[i];
            }
            else
            {
                int sell=prices[i]-buy;
                if (sell>profit)
                {
                    profit=sell;
                    System.out.println(profit);
                }

            }
        }
        return profit;
    }
}