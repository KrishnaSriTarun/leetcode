class Solution {
    private int atmost(int[] nums, int k){
        int ans=0;
        int val=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0){
                val++;
            }
            while(val>k){
                if(nums[i]%2!=0){
                    val--;
                }
                i++;
            }
            ans+=j-i+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}