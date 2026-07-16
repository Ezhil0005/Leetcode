class Solution {
    public int countSubstrings(String s) {
        int odd=0;
        int even=0;
        int end=0;
        int start=0;
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            count+=sub(s,i,i);
            count+=sub(s,i,i+1);
           int len= Math.max(odd,even);
            if(len>end-start+1)
            {
                start=i-(len-1)/2;
                end=i+len/2;
            }

        }
        return count;
    }
    private int sub(String s,int left,int right)
    {
        int count=0;
        while((left>=0&&right<s.length())&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
            count++;
        }
        return count;
        // return right-left-1;
    }
    }
