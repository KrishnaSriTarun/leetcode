class Solution {
    public int divide(int d, int div) {
        if (div == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (d == Integer.MIN_VALUE && div == -1) {
            return Integer.MAX_VALUE;
        }
        return d/div;
    }
}