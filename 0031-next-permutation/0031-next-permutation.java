class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if (index != -1) {
            for(int i=nums.length-1;i>index;i--){
                if(nums[index]<nums[i]){
                    swap(nums,index,i);
                    break;
                }
            }
        }
        reverse(nums,index+1,nums.length-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    private void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}