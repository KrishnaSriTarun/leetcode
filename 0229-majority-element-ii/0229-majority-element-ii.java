class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> lis=new ArrayList<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > nums.length/3){
                lis.add(key);
            }
        }
        return lis;
    }
}