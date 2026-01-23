class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String x="--X";
        String b="X++";
        String c="X--";
        String d="++X";
        int a=0;
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            if(s.equals(x))
            --a;
            else  if(s.equals(b))
            a++;
            else if(s.equals(c))
            a--;
            else
            ++a;
        }
        return a;
    }
}