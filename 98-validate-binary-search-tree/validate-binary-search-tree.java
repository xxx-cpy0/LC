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
    void inorder(TreeNode node,List<Integer> a){
        if(node != null){
            inorder(node.left,a);
            a.add(node.val);
            inorder(node.right,a);
        }
    }
    public boolean isValidBST(TreeNode root) {
        int i;
        List<Integer> ll = new ArrayList<>();
        inorder(root,ll);      
        for(i=1;i<ll.size();i++){
            if(ll.get(i - 1) < ll.get(i)) continue;
            else return false;
        }
        return true;

    }
}