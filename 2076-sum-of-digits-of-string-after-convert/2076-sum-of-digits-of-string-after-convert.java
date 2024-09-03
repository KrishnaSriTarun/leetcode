class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            sb.append(((int)s.charAt(i)-96));
        }
        String num = sb.toString();
        int sum = 0;
        while(k>0){
            sum=0;
            for(char c : num.toCharArray()){
                sum+=c-'0';
            }
            num=Integer.toString(sum);
            k--;
        }
        return sum;
    }
}