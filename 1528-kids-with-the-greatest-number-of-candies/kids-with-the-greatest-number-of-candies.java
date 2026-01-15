class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=0;
        for(int a:candies)
        {
            max=Math.max(max,a);
        }
        for(int b:candies)
        {
            res.add(b+extraCandies>=max);
        }
        return res;
    }
}