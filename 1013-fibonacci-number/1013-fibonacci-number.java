class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        while(n>0){
            int temp=a;
            a=b;
            b=temp+a;
            n--;
        }
        return a;
    }
}