class Solution {
    public int[] runningSum(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            nums[k]=nums[i-1]+nums[i];
            k++;
        }
        return nums;
    }
}