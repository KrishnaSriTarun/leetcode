class Solution {
    public int reverse(int x) {
        int num = 0; // To store the reversed number

        while (x != 0) {
            int k = x % 10;

            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && k > 7)) {
                return 0; 
            }
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && k < -8)) {
                return 0;
            }

            num = num * 10 + k;
            x = x / 10;
        }

        return num;
    }
}
