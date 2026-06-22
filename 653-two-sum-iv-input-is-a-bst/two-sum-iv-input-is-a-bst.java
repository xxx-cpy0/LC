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
    public void inorder(TreeNode root,List<Integer> l){
        if(root != null){
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root.left == null && root.right == null) return false;
        List<Integer> l = new ArrayList<>();
        inorder(root,l);
        int ll = 0,h = l.size()-1;
        System.out.print(l);
        while(ll < h){
            if(l.get(ll) + l.get(h) == k) return true;
            else if(l.get(ll) + l.get(h) > k) h--;
            else ll++;
        }
        return false;
    }
}