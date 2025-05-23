class Solution {
    public int countGoodSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            String sub=s.substring(i,3+i);
            if(sub.charAt(0)!=sub.charAt(1) && sub.charAt(1)!=sub.charAt(2) && sub.charAt(0)!=sub.charAt(2)){
                ans++;
            }
        }
        return ans;
    }
}