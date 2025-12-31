class Solution {
    public int maxProfit(int[] prices) {
        int a=prices.length;
        int low=prices[0];
        int max=0;
        int b=0;
        for(int i=1;i<a;i++)
        {
            if(low>prices[i])
            {
            low=prices[i];
            }
            else
            max=Math.max(max,prices[i]-low);
        }


        return max;
        
    }
}