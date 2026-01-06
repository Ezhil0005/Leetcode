class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int a=nums[0];
        int b=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
           
            
            count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>b)
            {
            a=nums[i];
            b=count;
            }
        }
        return a;
    }
}