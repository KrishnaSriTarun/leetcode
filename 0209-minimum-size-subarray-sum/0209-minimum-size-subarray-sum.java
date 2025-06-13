class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int val=0;
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            val+=nums[j];
            while(val>=target){
                ans=Math.min(ans,j-i+1);
                val-=nums[i++];
            }
        }
        return (ans==Integer.MAX_VALUE)? 0 :ans;
        
    }
}