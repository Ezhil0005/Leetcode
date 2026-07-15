class Solution {
    public int titleToNumber(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int in=1;
        for(char a='A';a<='Z';a++)
        {
            hm.put(a,in);
            in++;
        }
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            res=res*26+(hm.get(s.charAt(i)));
        }
        return res;
    }
      

    
}