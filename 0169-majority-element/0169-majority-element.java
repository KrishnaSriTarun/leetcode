// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int ele=0;
//         for(int num:nums){
//             if(map.containsKey(num)){
//                 map.put(num,map.get(num)+1);
//             }
//             else{
//                 map.put(num,1);
//             }
//         }
//         Set<Integer> keySet=map.keySet();
//         for(Integer key:keySet){
//             if(map.get(key)>(nums.length/2)){
//                 ele=key;
//             }
//         }
//         return ele;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele=0;
        for(int num:nums){
            if(count==0){
                ele=num;
                count =1;
            }
            else if(ele==num){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}