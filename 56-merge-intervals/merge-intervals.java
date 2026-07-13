class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int curr[]={intervals[0][0],intervals[0][1]};
        List<int[]> arr=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(curr[1]>=intervals[i][0])
            {
                 curr[1]=Math.max(curr[1],intervals[i][1]);
            }
            else
            {
                 arr.add(curr);
                curr=new int[]{intervals[i][0],intervals[i][1]};
            }
        }
        arr.add(curr);
        return arr.toArray(new int[0][]);
    }
}