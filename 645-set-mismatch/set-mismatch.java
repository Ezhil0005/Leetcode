class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int ord[]=new int[nums.length+1];
        for(int a:nums)
        {
            ord[a]++;
        }
        for(int i=1;i<=nums.length;i++)
        {
            
          if(ord[i]==2)
          {
            ans[0]=i;
          }
          if(ord[i]==0)
          {
            ans[1]=i;
          }
        }
            return ans;
               
    }
}