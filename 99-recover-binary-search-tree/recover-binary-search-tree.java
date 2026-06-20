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
    public void inorder(TreeNode root,List<TreeNode> a){
        if(root != null){
            inorder(root.left,a);
            a.add(root);
            inorder(root.right,a);
        }
    }
    public void recoverTree(TreeNode root) {
        List<TreeNode> l = new ArrayList<>();
        TreeNode cpy = root;
        inorder(cpy,l);
        TreeNode temp = new TreeNode(0);
        TreeNode first = null;
        TreeNode second = null;
        for(int i=0;i<l.size();i++) System.out.print(l.get(i).val+" ");
        for(int i=1;i<=l.size()-1;i++){
            if(l.get(i-1).val < l.get(i).val) continue;
            else{
                if(first == null && second == null) first = l.get(i - 1);
                second = l.get(i);
            }
        }
        System.out.print("\n"+first.val+" "+second.val);
        temp.val = first.val;
        first.val = second.val;
        second.val = temp.val;
    }
}