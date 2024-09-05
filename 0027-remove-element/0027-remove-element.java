class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Index to place elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Place element at the new index and increment
            }
        }

        // The new length of the array
        return k;
    }
}
