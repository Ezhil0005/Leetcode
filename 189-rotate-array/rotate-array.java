class Solution {
    public void rotate(int[] nums, int k) {
        int a[]=new int[nums.length];
        
        int len=nums.length;
        k=k%len;
        int ele=len-k;
        int l=0;
        for(int i=ele;i<len;i++)
        {
            a[l]=nums[i];
            l++;
        }
        for(int j=0;j<ele;j++)
        {
            a[l]=nums[j];
            l++;
        }
        for(int i=0;i<len;i++)
        {
            nums[i]=a[i];
        }


    }
}