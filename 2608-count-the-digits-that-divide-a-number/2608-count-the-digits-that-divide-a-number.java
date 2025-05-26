class Solution {
    public int countDigits(int num) {
        int n=0;
        int org=num;
        while(num!=0){
            int k=num%10;
            if(org%k==0 && k!=0){
                n++;
            }
            num=num/10;
        }
        return n;
    }
}