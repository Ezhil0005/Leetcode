class Solution {
    public int countSubstrings(String s) {
        int left=0;
        int right=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count+=sub(s,i,i);
            count+=sub(s,i,i+1);
        }
        return count;
    }
    private int sub(String s,int left,int right)
    {
        int count=0;
        while((left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)))
        {
            count++;
            left--;
            right++;
        }
        return count;
    }
}