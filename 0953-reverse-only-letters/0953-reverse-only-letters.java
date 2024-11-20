class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder rev=new StringBuilder("");
        StringBuilder res=new StringBuilder("");
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                rev.append(s.charAt(i));
            }
        }
        rev.reverse();
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                res.append(s.charAt(i));
            }
            else{
                res.append(rev.charAt(j));
                j++;
            }
        }
        return res.toString();
    }
}