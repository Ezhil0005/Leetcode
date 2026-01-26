class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int a:nums)
        {
            int temp=a;
            int count=0;
            while(temp!=0)
            {
                int b=temp%10;
                count++;
                temp/=10;
            }
            if(count%2==0)
            {
                even++;
            }
        }
        return even;
    }
}