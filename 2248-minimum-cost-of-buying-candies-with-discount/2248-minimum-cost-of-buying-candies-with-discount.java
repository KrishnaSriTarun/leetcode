class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int take=0;
        int ans=0;
        for(int i=cost.length-1;i>=0;i--){
            if(take==2){
                take=0;
            }
            else{
                ans+=cost[i];
                take++;
            }
        }
        return ans;
    }
}