class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder("");
        for(char c : s.toCharArray()){
            sb.append(c-'a'+1);
        }
        s= sb.toString();
        int sum = 0;
        while(k>0){
            sum=0;
            for(char c : s.toCharArray()){
                sum+=c-'0';
            }
            s=Integer.toString(sum);
            k--;
        }
        return sum;
    }
}