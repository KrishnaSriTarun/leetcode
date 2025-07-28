class Solution {
    static int sol=0;
    public int reversePairs(int[] nums) {
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if ((long)nums[i] > 2L * nums[j]) {
        //             sol++;
        //         }
        //     }
        // }
        // return sol;
        sol = 0;
        divide(nums, 0, nums.length - 1);
        return sol;
    }
    public void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int count=0;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        countPairs(arr,si,mid,ei);
        merge(arr, si, mid, ei);
    }
    public void countPairs(int[] arr, int si, int mid, int ei){
        int right =mid+1;
        for(int i=si;i<=mid;i++){
           while (right <= ei && (long)arr[i] > 2L * arr[right]) right++;
        sol+=(right-(mid+1));
        }
    }

    public void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
