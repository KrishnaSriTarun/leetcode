import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums);

        int cnt = 1;
        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                cnt++;
            } else {
                maxLen = Math.max(maxLen, cnt);
                cnt = 1;
            }
        }

        return Math.max(maxLen, cnt); // Handle final sequence
    }
}
