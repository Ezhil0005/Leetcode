class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int rev=0;
        while(temp>0)
        {
            int b=temp%10;
            rev=(rev*10)+b;
            temp/=10;
    }
    int temp1=rev;
    int rev1=0;
    boolean check=false;
    while(temp1>0)
    {
        int c=temp1%10;
        if(c==6&&!check)
        {
            c+=3;
            check=true;
        }
        rev1=(rev1*10)+c;
        temp1/=10;


    }
   return rev1;
    }
}
