class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int val=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int diff=nums[i+k-1]-nums[i];
            val=Math.min(val,diff);
        }
        return val;
    }
}