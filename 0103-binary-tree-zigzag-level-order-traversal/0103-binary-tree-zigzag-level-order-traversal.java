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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null) return arr;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int level=q.size();

            for(int i=0;i<level;i++){
                TreeNode curr=q.poll();
                if (leftToRight) {
                    list.add(curr.val);
                } else {
                    list.add(0, curr.val);
                }
                
                if(curr.left !=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            arr.add(list);
            leftToRight = !leftToRight;
        }
        return arr;
    }
}