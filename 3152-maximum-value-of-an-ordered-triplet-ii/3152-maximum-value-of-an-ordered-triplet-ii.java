class Solution {
    public long maximumTripletValue(int[] nums) {
        if (nums.length < 3) return 0;

        int prefix = nums[0]; 
        long ans = 0;
        int diff=Integer.MIN_VALUE;
        
        for (int j = 1; j < nums.length-1; j++) {
            diff=Math.max(diff,prefix-nums[j]);
            ans=Math.max(ans,(long)diff*nums[j+1]);
            prefix=Math.max(prefix,nums[j]);
        }
        return ans;
    }
}
