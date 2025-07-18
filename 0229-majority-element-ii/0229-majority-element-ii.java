class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lis = new ArrayList<>();
        Integer ele1 = null;
        Integer ele2 = null;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (ele1 != null && num == ele1) {
                count1++;
            } else if (ele2 != null && num == ele2) {
                count2++;
            } else if (count1 == 0) {
                ele1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Recount to confirm majority
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (ele1 != null && num == ele1) count1++;
            else if (ele2 != null && num == ele2) count2++;
        }

        if (count1 > nums.length / 3) lis.add(ele1);
        if (count2 > nums.length / 3) lis.add(ele2);

        return lis;
    }
}
