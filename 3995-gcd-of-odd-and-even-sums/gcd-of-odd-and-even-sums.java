class Solution {
    public int gcdOfOddEvenSums(int n) {
        int m=0;
        int odd=0;
        int even=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                even+=i;
            }
            else
            odd+=i;
        }
        int gcd=0;
        if(n==1)
        {
            return 1;
        }
        for(int i=2;i<odd;i++)
        {
            
            if(even%i==0&&odd%i==0)
            {
                gcd=Math.max(i,gcd);
            }
        }
        return gcd;
    }
}