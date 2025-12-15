class Solution {
    public int addDigits(int num) {
        int a=num;
        while(a>9)
        {
            int b=a%10;
        int c=a/10;
        a=b+c;
    }
    return a;
}
}