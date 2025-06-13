class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int val=0;
        int i=0;
        int temp=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0){
                val++;
                temp=0;
            }
            while(val==k){
                temp++;
                if(nums[i++]%2!=0){
                    val--;
                }
            }
            count+=temp;
        }
        return count;
    }
}