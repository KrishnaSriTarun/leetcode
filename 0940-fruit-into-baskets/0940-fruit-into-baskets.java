class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0;
        int ans=0;
        for(int j=0;j<fruits.length;j++){
            int val=fruits[j];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>2){
                int lval=fruits[i];
                hm.put(lval,hm.get(lval)-1);
                if(hm.get(lval)==0) hm.remove(lval);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}