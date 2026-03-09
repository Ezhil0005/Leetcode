class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(String a:tokens)
        {
            if(a.matches("-?\\d+"))
            {
                st.push(Integer.parseInt(a));
            }
            else 
            {
                int b=st.pop();
                int c=st.pop();
                if(a.equals("+"))
                st.push(c+b);
                else if(a.equals("*"))
                st.push(b*c);
                else if(a.equals("-"))
                st.push(c-b);
                else
                st.push(c/b);
            }
        }
        return st.pop();
    }
}