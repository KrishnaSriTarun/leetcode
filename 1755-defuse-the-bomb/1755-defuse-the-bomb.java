class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        int val=Math.abs(k);
        int j=0;
        for(int i=0;i<code.length;i++){
            int temp=0;
            int count=0;
            if(k>0){
                j=i+1;
            }
            else if(k<0){
                j=i-1;
            }
            else{
                j=0;
            }
            while(count<val){
                if(j>=code.length){
                    j=0;
                }
                else if( j<0){
                    j=code.length-1;
                }
                if(k>0){
                    temp+=code[j++];
                }
                else if(k<0){
                    temp+=code[j--];
                }
                else{
                    temp=0;
                }
                
                count++;
            }
            arr[i]=temp;
        }
        return arr;
    }
}