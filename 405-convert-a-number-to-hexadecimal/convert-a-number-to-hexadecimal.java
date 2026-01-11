class Solution {
    public String toHex(int num) {
        char arr[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int temp=num;
       if(temp==0) return "0";
       StringBuffer sb=new StringBuffer();
        while(temp!=0)
        {
            int b=temp&15;
            temp>>>=4;
            sb.insert(0,arr[b]);
           
        }
        return sb.toString();


    }
}