/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode helper(TreeNode root,TreeNode p,TreeNode q){
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        if(root.val > p.val && root.val > q.val) root = helper(root.left,p,q);
        else if(root.val < p.val && root.val < q.val) root = helper(root.right,p,q);
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cpy = root;
        return helper(cpy,p,q);      
    }
}