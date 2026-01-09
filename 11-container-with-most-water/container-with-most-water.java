class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
      int last=len-1;
      int front=0;
      int sum=0;
      int total=0;
      while(front<last)
      {
        int a=last-front;
        if(height[last]<height[front])
        {
            total=height[last]*a;
            last--;
        }
        else
        {
        total=height[front]*a;
        front++;
        }

        if(total>sum)
        {
            sum=total;
        }
      }
      return sum;
    }
}