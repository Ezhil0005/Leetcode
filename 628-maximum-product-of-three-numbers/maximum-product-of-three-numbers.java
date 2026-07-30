class Solution {
    public int maximumProduct(int[] nums) {
        int arr[]=new int[nums.length];
        int n=nums.length;
        int pro=1;
        Arrays.sort(nums);
        int a=nums[n-1]*nums[n-2]*nums[n-3];
        int b=nums[0]*nums[1]*nums[n-1];
        return Math.max(a,b);
    }
}