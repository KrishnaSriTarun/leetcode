class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        while(n>0){
            int k=n%10;
            mul=mul*k;
            sum+=k;
            n=n/10;
        }
        return mul-sum;
    }
}