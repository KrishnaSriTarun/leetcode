class Solution {
    public int scoreOfString(String s) {
        char ch=s.charAt(0);
        int c=0;
        for(int i=1;i<s.length();i++){
            c+=Math.abs((int)ch-(int)(s.charAt(i)));
            ch=s.charAt(i);
        }
        return c;
    }
}