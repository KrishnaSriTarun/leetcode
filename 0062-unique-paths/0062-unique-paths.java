class Solution {
    // public int uniquePaths(int m, int n) {
    //     return path(0,0,m,n);
    // }
    // public int path(int row,int col,int m, int n){
    //     if(row>=m || col>=n){
    //         return 0;
    //     }
    //     if (row == m - 1 && col == n - 1) return 1;
    //     return path(row+1,col,m,n)+path(row,col+1,m,n);
    // }

    // public int uniquePaths(int m, int n) {
    //     int[][] dp=new int[m][n];
    //     for(int[] row : dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return path(0,0,m,n,dp);
    // }
    // public int path(int row,int col,int m, int n,int[][] dp){
    //     if(row>=m || col>=n){
    //         return 0;
    //     }
    //     if (row == m - 1 && col == n - 1) return 1;
    //     if(dp[row][col]!=-1){
    //         return dp[row][col];
    //     }
    //     dp[row][col]= path(row+1,col,m,n,dp)+path(row,col+1,m,n,dp);
    //     return dp[row][col];
    // }
    public int uniquePaths(int m, int n) {
        int N=m+n-2;
        int r=m-1;
        double res=1;
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }
}