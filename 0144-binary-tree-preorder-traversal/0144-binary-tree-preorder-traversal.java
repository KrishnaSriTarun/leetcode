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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        pre(root,arr);
        return arr;
    }
    private void pre(TreeNode node,List<Integer> arr){
        if(node==null){
            return;
        }
        arr.add(node.val);
        pre(node.left,arr);
        pre(node.right,arr);
    }
}