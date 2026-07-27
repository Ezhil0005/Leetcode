class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
           
                if(arr[i]<min)
                {
                min=arr[i];
                }
                else
                {
                total=Math.max(total,arr[i]-min);
                }

           
        }
        return total;
    }
}