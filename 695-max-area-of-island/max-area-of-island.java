class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 if(grid[i][j]!=0&&!visited[i][j])
                 {
                int sum=dfs(grid,visited,i,j);
                max=Math.max(sum,max);
                 }
            }
        }
        return max;

    }
    int dfs(int  grid[][],boolean visited[] [],int i,int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0||visited[i][j])
        return 0;
        visited[i][j]=true;
        int sum=grid[i][j];
        sum+=dfs(grid,visited,i+1,j);
        sum+=dfs(grid,visited,i-1,j);
        sum+=dfs(grid,visited,i,j+1);
        sum+=dfs(grid,visited,i,j-1);
        return sum;
    }
}