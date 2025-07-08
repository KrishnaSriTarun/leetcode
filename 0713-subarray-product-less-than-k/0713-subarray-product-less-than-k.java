class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int ans=0;
        int val=1;
        if (k <= 1) return 0;
        for(int j=0;j<nums.length;j++){
            val*=nums[j];
        
            while(val>=k){
                val/=nums[i];
                i++;
            }
            ans+=(j-i+1);
        }
        return ans;
    }
}