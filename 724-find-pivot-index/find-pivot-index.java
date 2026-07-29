class Solution {
    public int pivotIndex(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            arr[i]=arr[i-1]+nums[i];
        }
        int sum=arr[nums.length-1];
        int left=0;
        int ls=0;
        int rs=-1;
        int leftsum=0;

        while(left<nums.length)
        {
            ls+=nums[left];
            rs=sum-ls;
            if(rs==leftsum) return left;
            leftsum=ls;
            left++;
        }
        return -1;
    }
}