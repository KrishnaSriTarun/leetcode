class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans=Double.MAX_VALUE;
        int j=nums.length-1;
        for(int i=0;i<=nums.length/2;i++){
            double sum=(nums[i]+nums[j--])/2.0;
            ans=Math.min(sum,ans);
        }
        return ans;
    }
}