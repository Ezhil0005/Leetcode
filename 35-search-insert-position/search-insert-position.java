class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if(i<nums.length-1)
            {
                if(target>nums[i]&&target <nums[i+1])
                  return i+1;
            }

          
        }
        if(target<nums[0])
        return 0;
        else
        return nums.length;
       
    }
}