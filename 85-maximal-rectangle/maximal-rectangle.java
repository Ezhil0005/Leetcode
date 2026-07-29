class Solution {
    public int maximalRectangle(char[][] matrix) {
        int height[]=new int[matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                height[j]++;
                else
                height[j]=0;
            }
            max=Math.max(max,large(height));
        }
        return max;
    }
    public int large(int h[])
    {
        int max=0;
        Stack<Integer> st=new Stack<>();
        int n=h.length;
        for(int i=0;i<=n;i++)
        {
            int curr=(i==n)?0:h[i];
            while(!st.isEmpty() && h[st.peek()]>curr)
            {
                int hei=h[st.pop()];
                int width;
                if(st.isEmpty())
                width=i;
                else
                width=i-st.peek()-1;
                max=Math.max(max,hei*width);
            }
            st.push(i);
        }
        return max;
    }
}