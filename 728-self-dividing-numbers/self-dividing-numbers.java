class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            boolean flag=false;
            int temp=i;
            while(temp>0)
            {
            int rem=temp%10;
            if(rem!=0&&i%rem==0)
                flag=true;
                else
                {
                flag=false;
                break;
                }
                temp/=10;
               
            }
            if(flag)
            res.add(i);

        }
        return res;
    }
}