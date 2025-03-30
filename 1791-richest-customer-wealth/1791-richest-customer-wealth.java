class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int[] a:accounts){
            int k=0;
            for(int j=0;j<a.length;j++){
                k+=a[j];
            }
            if(ans<k){
                ans=k;
            }
        }
        return ans;
    }
}