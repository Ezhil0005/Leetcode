class Solution {
    public void reverseString(char[] s) {
        char[] c=new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--)
        {
            c[j]=s[i];
            j++;
        }
        int k=0;
        for(int i=0;i<s.length;i++)
        {
            s[k]=c[i];
            k++;
        }
        
    }
}