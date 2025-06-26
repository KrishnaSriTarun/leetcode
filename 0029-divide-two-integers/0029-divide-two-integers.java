class Solution {
    public int divide(int d, int div) {
        if (d == Integer.MIN_VALUE && div == -1) {
            return Integer.MAX_VALUE;
        }
        return d/div;
    }
}