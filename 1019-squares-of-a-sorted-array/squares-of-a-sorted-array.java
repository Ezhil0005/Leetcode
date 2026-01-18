class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a=Math.abs(nums[i]);
            res[i]=a*a;
        }
        Arrays.sort(res);
        return res;
    }
}