class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
             int right=sum-left-nums[i];
             ans[i]=Math.abs(left-right);
             left+=nums[i];
        }
        // int[] leftSum = new int[n];
        // int[] rightSum = new int[n];
        // for (int i = 1; i < n; i++) {
        //     leftSum[i] = leftSum[i - 1] + nums[i - 1];
        // }
        // for (int i = n - 2; i >= 0; i--) {
        //     rightSum[i] = rightSum[i + 1] + nums[i + 1];
        // }
        // for (int i = 0; i < n; i++) {
        //     ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        // }

        return ans;
    }
}
