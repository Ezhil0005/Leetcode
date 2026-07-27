class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        k=k%nums.length;
        int n=nums.length-k;
        int m=0;
        for(int i=n;i<nums.length;i++)
        {
            arr[m]=nums[i];
            m++;
        }
        for(int i=0;i<n;i++)
        {
            arr[m]=nums[i];
            m++;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
    }
}