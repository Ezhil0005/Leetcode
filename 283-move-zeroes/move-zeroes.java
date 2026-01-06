class Solution {
    public void moveZeroes(int[] nums) {
        int k=nums.length-1;
        int j=0;
        for(int i=0;i<=k;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
            
            for(int l=j;l<=k;l++)
            {
                nums[l]=0;
                
            }
            

        
        
    }
}
