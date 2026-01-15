class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        int n=columnNumber;
        while(n>0)
        {
            n--;
            int r=n%26;
            char  c=(char)('A'+r);
            sb.append(c);
            n/=26;

        }
        return sb.reverse().toString();
    }
}