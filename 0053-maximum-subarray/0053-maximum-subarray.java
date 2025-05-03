class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            ans=Math.max(cs,ans);
            if(cs<0){
                cs=0;
            }
        }
        return ans;
    }
}