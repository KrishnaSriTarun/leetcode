class Solution {
    public int[] runningSum(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            nums[i]+=k;
            k=nums[i];
        }
        return nums;
    }
}