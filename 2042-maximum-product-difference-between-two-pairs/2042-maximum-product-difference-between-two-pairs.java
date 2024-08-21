class Solution {
    public int maxProductDifference(int[] arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1]*arr[arr.length-2];
        int min= arr[0]*arr[1];
        return max-min;
    }
}