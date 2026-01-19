class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        int x=find(nums,0,n-2);
        int y=find(nums,1,n-1);
        return Math.max(x,y);
    }
        int find(int nums[],int start,int stop)
        {
            int prev1=0;
            int prev2=0;
        for(int i=start;i<=stop;i++)
        {
            int temp=prev1;
            prev1=Math.max(prev2+nums[i],prev1);
            prev2=temp;
        }
        return prev1;
        }
    }
