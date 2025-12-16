class Solution {
    public int countEven(int num) {
        int temp=num;
        int sum=0;
        int count=0;
       while(temp!=0)
       {
        int b=temp%10;
        sum+=b;
        temp/=10;
       }
       if(sum%2==0)
       return (num/2);
       return (num-1)/2;
}
}