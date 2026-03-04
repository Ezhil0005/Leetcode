class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int count=0;
        int steps=0;
        int a=0;
        for(int i=0;i<n-1;i++)
        {
            steps=Math.max(nums[i]+i,steps);
            if(i==a)
            {
            count++;
            a=steps;
            }
        }
        return count;
    }
}