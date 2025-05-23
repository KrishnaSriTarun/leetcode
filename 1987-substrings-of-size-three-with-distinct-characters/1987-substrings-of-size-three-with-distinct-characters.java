class Solution {
    public int countGoodSubstrings(String s) {
        int ans=0;
        char sub[]=s.toCharArray();
        for(int i=0;i<sub.length-2;i++){
            if(sub[i]!=sub[i+1] && sub[i+1]!=sub[i+2] && sub[i]!=sub[i+2]){
                ans++;
            }
        }
        return ans;
    }
}