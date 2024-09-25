class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int pre=1;
        int post=1;
        int k=0;
        for(int i:nums){
            ans[k++]=pre;
            pre*=i;
        }
        for(int j=nums.length-1;j>=0;j--){
            ans[j]*=post;
            post*=nums[j];
        }
        return ans;
    }
}