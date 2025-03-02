/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        postOrder(root,arr);
        return arr;
    }
    private void postOrder(TreeNode node,ArrayList<Integer> arr){
        if(node==null){
            return;
        }
        postOrder(node.left,arr);
        postOrder(node.right,arr);
        arr.add(node.val);
    }
}