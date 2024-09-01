class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder a=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))) {
                a.append(s.charAt(i));
            }
        }
        if(a.toString().equals(a.reverse().toString())){
            return true;
        }
        else{
            return false;
        }
    }
}