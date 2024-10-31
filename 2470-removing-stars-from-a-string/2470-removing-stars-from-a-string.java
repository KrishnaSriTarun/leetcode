import java.util.Stack;

class Solution {
    public String removeStars(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(curr); 
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()); 
        }

        return sb.reverse().toString();
    }
}
