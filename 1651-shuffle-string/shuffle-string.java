class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char sr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            sr[indices[i]]=s.charAt(i);
        }
        return new String(sr);
    }
}