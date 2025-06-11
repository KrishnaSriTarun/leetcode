class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        // for(int i=0;i<nums.length;i++){
            int val=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==1){
                    val++;
                }
                else{
                    val=0;
                }
                ans=Math.max(ans,val);
            }
        // }
        return ans;
    }
}