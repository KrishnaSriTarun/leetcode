class Solution {
    public int maxProfit(int[] p) {
        int ans=0;
        int price=p[0];
        for(int i=0;i<p.length;i++){
            if(p[i]<price){
                price=p[i];
            }
            else{
                ans=Math.max(ans,p[i]-price);
            }
        }
        return ans;
    }
}