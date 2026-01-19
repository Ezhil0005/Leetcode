class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    res.add(nums1[i]);
                }
            }
        }
        int ans[]=new int[res.size()];
        int h=0;
        for(int b:res)
        {
            ans[h++]=b;
        }
        return ans;
    }
}