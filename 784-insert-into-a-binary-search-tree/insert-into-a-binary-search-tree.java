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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode root1 = root;
        if(root == null){
            TreeNode t = new TreeNode(val);
            return t;
        }
        else{
            while(root1 != null){
            if(val > root1.val){
                if(root1.right == null){
                    TreeNode temp = new TreeNode(val);
                    root1.right = temp;
                    break;
                }
                root1 = root1.right;
            }
            if(val < root1.val){
                if(root1.left == null){
                    TreeNode temp = new TreeNode(val);
                    root1.left = temp;
                    break;
                }
                root1 = root1.left;
            }
        }
        }
        return root;
    }
}