class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int max=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int ele=num;
                while(set.contains(ele+1)){
                    count++;
                    ele++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}