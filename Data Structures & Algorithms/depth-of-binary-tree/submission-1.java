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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
       int ans = 0;
       Queue<TreeNode> tree = new LinkedList<>();
       tree.offer(root);
       while(!tree.isEmpty()){
        ans++;
        int n = tree.size();
        for(int i = 0; i < n; i++){
            TreeNode val = tree.poll();
            if(val.left != null){
                tree.offer(val.left);
            }
            if(val.right != null){
                tree.offer(val.right);
            }
        }

       }
       return ans; 
    }
}
