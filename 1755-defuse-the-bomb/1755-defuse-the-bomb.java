class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] arr=new int[n];
        int val=Math.abs(k);
        int j=0;
        if(k==0) return arr;
        for(int i=0;i<n;i++){
            int temp=0;
            int count=0;
            while(count<val){
                if(k>0){
                    j=(i+count+1)%n;
                }
                else{
                    j=(i-count-1+n)%n;
                }
                temp+=code[j];
                count++;
            }
            arr[i]=temp;
        }
        return arr;
    }
}