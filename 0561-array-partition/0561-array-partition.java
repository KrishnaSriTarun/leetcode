class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        int i=0;
        while (i<nums.length){
            
            sum += nums[i];
            i+=2;
        }
        return sum;
    }
}