// class Solution {
//     public int maxConsecutiveAnswers(String arr, int k) {
//         return Math.max(maxValues(arr,k,'T'),maxValues(arr,k,'F'));
//     }
//     private static int maxValues(String key, int k,char tar){
//         int val=0;
//         int i=0;
//         int ans=0;
//         for(int j=0;j<key.length();j++){
//             if(key.charAt(j)==tar){
//                 val++;
//             }
//             while(val>k){
//                 if(key.charAt(i++)==tar){
//                     val--;
//                 }
//             }
//             ans=Math.max(ans,j-i+1);
//         }
//         return ans;
//     }
// }

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0;
        int   ctnt=0;
        int ctnf =0;
        int l=0;
        for(int r=0;r<answerKey.length();r++){
            if (answerKey.charAt(r) == 'T'){
                ctnt++;
            }
            else{
                ctnf++;
            }
            while(Math.min(ctnt,ctnf) > k){
                if (answerKey.charAt(l) == 'T'){
                    ctnt--;
                }
                else{
                    ctnf--;
                }
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }

        return ans;
    }
}