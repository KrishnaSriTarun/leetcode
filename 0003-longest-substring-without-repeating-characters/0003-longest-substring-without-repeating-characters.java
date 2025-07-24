class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int ans=0;
        int right =0;
        int left=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}