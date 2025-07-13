class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m[0].length;j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][n - 1 - j];
                m[i][n - 1 - j] = temp;
            }
        }
    }
}