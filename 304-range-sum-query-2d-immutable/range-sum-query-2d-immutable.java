class NumMatrix {

    int arr[][];
    public NumMatrix(int[][] matrix) {
        int m=matrix.length+1;
        int n=matrix[0].length+1;
        arr=new int[m][n];
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[i][j]=arr[i-1][j]+arr[i][j-1]+matrix[i-1][j-1]-arr[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total=arr[row2+1][col2+1]-arr[row1][col2+1]-arr[row2+1][col1]+arr[row1][col1];
        return total;
}
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */