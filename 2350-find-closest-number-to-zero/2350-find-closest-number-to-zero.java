class Solution {
    public int findClosestNumber(int[] nums) {
        int val=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            val=Math.min(val,Math.abs(nums[i]));
        }
        for(int i=0;i<nums.length;i++){
            if(val==nums[i]){
                return nums[i];
            }
        }
        return -val;
    }
}