class Solution {
    public boolean canJump(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(i>max) return false;
            if(max>=n) return true;
            max=Math.max(max,arr[i]+i);
        }
        return true;
}
}