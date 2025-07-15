class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        
        long sn = (long) N * (N + 1) / 2;
        long s2n = (long) N * (N + 1) * (2L * N + 1) / 6;
        
        long s = 0;
        long s2 = 0;
        long x = 0;
        long y = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                s += grid[i][j];
                s2 += (long) grid[i][j] * grid[i][j];
            }
        }

        long a = s - sn;
        long b = s2 - s2n;
        long c = b / a;
        x = (c + a) / 2;
        y = c - x;

        return new int[]{(int) x, (int) y};
    }
}
