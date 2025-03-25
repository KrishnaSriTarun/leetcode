class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            int k=start+2*i;
            ans^=k;
        }
        return ans;
    }
}