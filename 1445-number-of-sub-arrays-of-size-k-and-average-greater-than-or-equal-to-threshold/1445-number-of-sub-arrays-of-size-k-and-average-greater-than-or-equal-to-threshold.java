class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int j=0;
        int temp=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            if(i-j+1==k){
                if((temp/k)>=threshold){
                    count++;
                }
                temp-=arr[j++];
            }
        }
        return count;
    }
}