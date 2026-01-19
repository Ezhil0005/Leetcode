class Solution {
    public int rob(int[] nums) {
        int sum=0;
        int pre=0;
        for(int a:nums)
        {
            int temp=sum;
            sum=Math.max(a+pre,sum);
            pre=temp;
        }
        return sum;
    }
}