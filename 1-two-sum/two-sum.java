class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=target-nums[i];
             if(hm.containsKey(sum))
            return new int[]{hm.get(sum),i};
            hm.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}