class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int n: nums){
            hs.add(n);
        }
        int n = nums.length;
        int k=hs.size();
        hs.clear();
        int i=0;
        int ans=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int j=0;j<n;j++){
            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
            while(freq.size()==k){
                ans+=(n-j);
                freq.put(nums[i],freq.get(nums[i])-1);
                if(freq.get(nums[i])==0){
                    freq.remove(nums[i]);
                }
                i++;
            }
        }
        return ans;
    }
}