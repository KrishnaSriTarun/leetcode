class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[n*n];
        int ans[]=new int[2];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        if(arr[0]!=1){
            ans[1]=1;
        }
        if(arr[arr.length-1]!=n*n){
            ans[1]=n*n;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                ans[0]=arr[i];
            }
            if (arr[i + 1] - arr[i] == 2 && ans[1] == 0) {
                ans[1] = arr[i] + 1; 
            }
        }
        return ans;
    }
}