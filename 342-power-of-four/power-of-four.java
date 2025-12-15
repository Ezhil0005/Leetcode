class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        double a=n;
        while(a>4)
        {
            a/=4;
        }
       return a==4;
    }
}