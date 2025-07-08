class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int i=0;
        int ans=0;
        int a=0;
        int b=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='0'){
                a++;
            }
            else{
                b++;
            }
            while(a>k && b>k){
                if(s.charAt(i)=='0'){
                    a--;
                }
                else{
                    b--;
                }
                i++;
            }
            ans+=(j-i+1);
        }
        return ans;
    }
}
