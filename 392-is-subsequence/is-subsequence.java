class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int n=0;
        boolean bb[]=new boolean[t.length()];
        for(int i=0;i<t.length();i++)
        bb[i]=false;
        if(s.length()==0) return true;
        for(int i=0;i<s.length();i++)
        {
            for(int j=n;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    if(j>=n &&!bb[j])
                    {
                    count++;
                    n=j+1;
                    bb[j]=true;
                    break;
                    }
                }
                 

            }
            if(count==s.length())
                    return true;
        }
       
        return false;
    }
}