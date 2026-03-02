class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
       int left=0;
       int res=0;
       for(int i=0;i<n;i++)
       {
        char ch=s.charAt(i);
        if(map.containsKey(ch))
        left=Math.max(left,map.get(ch)+1);
        map.put(ch,i);
        res=Math.max(res,i-left+1);
       }
       return res;
}
}