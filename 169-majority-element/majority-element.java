class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int b=0;
       for(int a:nums)
       {
            if(count==0)
            {
                b=a;
            }
            if(a==b)
            count++;
            else count--;
       }
       return b;
    }
}