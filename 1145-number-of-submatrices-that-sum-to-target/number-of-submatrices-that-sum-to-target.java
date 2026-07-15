class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count=0;
        for(int i=0;i<matrix.length;i++)
        {
            int [] temp=new int[matrix[0].length];
            for(int k=i;k<matrix.length;k++)
            {
            for(int j=0;j<matrix[0].length;j++)
            {
                temp[j]+=matrix[k][j];
            }
            HashMap<Integer,Integer> hm=new HashMap<>();
            int sum=0;
            hm.put(0,1);
            for(int m:temp)
            {
                sum+=m;
                if(hm.containsKey(sum-target))
                {
                    count+=hm.get(sum-target);
                }
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
            }
        }
        return count;
    }
}