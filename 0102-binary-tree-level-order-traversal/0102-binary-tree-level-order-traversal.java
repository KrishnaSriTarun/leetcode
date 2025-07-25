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
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> arr=new ArrayList<>();
//         if(root==null) return arr;
//         List<Integer> list=new ArrayList<>();
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         while(!q.isEmpty()){
//             TreeNode curr=q.remove();
//             if(curr==null){
//                 arr.add(new ArrayList<>(list));
//                 list.clear();

//                 if(q.isEmpty()) break;
//                 else q.add(null);
//             }
//             else{
//                 list.add(curr.val);
//                 if(curr.left!=null){
//                     q.add(curr.left);
//                 }
//                 if(curr.right !=null){
//                     q.add(curr.right);
//                 }
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null) return arr;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int level=q.size();

            for(int i=0;i<level;i++){
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left !=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            arr.add(list);

        }
        return arr;
    }

}