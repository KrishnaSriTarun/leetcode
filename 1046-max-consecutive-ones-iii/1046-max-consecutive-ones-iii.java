class Solution {
    public int longestOnes(int[] arr, int k) {
        int val=0;
        int i=0;
        int ans=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                val++;
            }
            while(val>k){
                if(arr[i++]==0){
                    val--;
                }
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}