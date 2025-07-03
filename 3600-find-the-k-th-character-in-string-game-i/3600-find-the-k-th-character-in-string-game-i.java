class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        int n=sb.length();
        while(n<k){
            String str=sb.toString();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                char ch2=(char)(ch+1);
                sb.append(ch2);
            }
            n=sb.length();
        }
        return sb.charAt(k-1);
    }
}