class Solution {
    public void sortColors(int[] nums) {
     int low=0;
     int n=nums.length;
     int mid=0;
     int high=n-1;
     for(int i=0;i<n;i++)
     {
        if(nums[mid]==0)
        {
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            mid++;
            low++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else
        {
            int temp2=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp2;
            high--;
        }
        
     }  
    }
}