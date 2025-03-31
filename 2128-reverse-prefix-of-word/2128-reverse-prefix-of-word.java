class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sc=new StringBuilder("");
        int index=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        if(index==-1){
            return word;
        }
        for(int i=index;i>=0;i--){
            sc.append(word.charAt(i));
        }
        for(int i=index+1;i<word.length();i++){
            sc.append(word.charAt(i));
        }
        return sc.toString();
    }
}