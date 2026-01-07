class Solution {
    public void rotate(int[] nums, int k) {
        int a=nums.length;
        k=k%a;
        int b=a-k;
        int c=0;
        int res[]=new int[a];
        for(int i=b;i<a;i++)
        {
            res[c]=nums[i];
            c++;
        }
        for(int i=0;i<b;i++)
        {
            res[c]=nums[i];
            c++;
        }
        for(int i=0;i<a;i++)
        {
            nums[i]=res[i];
        }

    }
}