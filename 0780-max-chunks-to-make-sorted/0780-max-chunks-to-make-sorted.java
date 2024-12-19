import java.util.Stack;

class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty() || arr[i] >= s.peek()) {
                s.push(arr[i]);
            } else {
                int max = s.pop(); 
                while (!s.isEmpty() && s.peek() > arr[i]) {
                    s.pop();
                }
                s.push(max); 
            }
        }
        return s.size(); 
    }
}
