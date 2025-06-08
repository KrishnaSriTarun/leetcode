class Solution {
    public int maxConsecutiveAnswers(String arr, int k) {
        return Math.max(maxValues(arr,k,'T'),maxValues(arr,k,'F'));
    }
    private static int maxValues(String key, int k,char tar){
        int val=0;
        int i=0;
        int ans=0;
        for(int j=0;j<key.length();j++){
            if(key.charAt(j)==tar){
                val++;
            }
            while(val>k){
                if(key.charAt(i++)==tar){
                    val--;
                }
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}