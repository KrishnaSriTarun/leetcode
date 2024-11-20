class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right){
            while(left<right && !Character.isLetter(ch[left])){
                left++;
            }
            while(left<right && !Character.isLetter(ch[right])){
                right--;
            }
            if(left<right){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}