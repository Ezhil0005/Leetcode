class Solution {
    public int climbStairs(int n) {
        int sum=0;
        if(n<4)
        {
            return n;
        }
    int a=0;
    int b=1;
    for(int i=0;i<n;i++)
    {
        sum=a+b;
        a=b;
        b=sum;
    }
    return b;

    }
}