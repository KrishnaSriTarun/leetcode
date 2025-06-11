class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        int k=p.length();
        HashMap<Character,Integer> hma=new HashMap<>();
        HashMap<Character,Integer> hmb=new HashMap<>();
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            hma.put(ch,hma.getOrDefault(ch,0)+1);
        }
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            hmb.put(ch,hmb.getOrDefault(ch,0)+1);

            if(j-i+1>k){
                if(hmb.get(s.charAt(i))>1){
                    int temp=hmb.get(s.charAt(i));
                    hmb.put(s.charAt(i),temp-1);
                }
                else{
                    hmb.remove(s.charAt(i));
                }
                i++;
            }

            if(j - i + 1 == k  && check(hma,hmb)){
                arr.add(i);
            }
        }
        return arr;
    }
    private boolean check(HashMap<Character,Integer> hma, HashMap<Character,Integer> hmb){
        if(hma.size()!=hmb.size()){
            return false;
        }
        for(char key: hma.keySet()){
            if(!hmb.containsKey(key)){
                return false;
            }
            int a=hma.get(key);
            int b=hmb.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
}