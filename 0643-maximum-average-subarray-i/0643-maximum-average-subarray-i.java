class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // double ans=Double.NEGATIVE_INFINITY;
        // int l=0;
        // int temp=0;
        // for(int i=0;i<nums.length;i++){
        //     temp+=nums[i];
        //     if(i-l+1>k){
        //         temp-=nums[l];
        //         l++;
        //     }
        //     if(i-l+1==k){
        //         ans=Math.max(ans,temp);
        //     }
        // }
        // return ans/(double)k;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return (double) max/k;
    }
}