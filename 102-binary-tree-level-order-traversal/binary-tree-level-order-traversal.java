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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ll;
        else{
            int value;
            q.add(root);
            value = root.val;
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> l = new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode temp = new TreeNode();
                    temp = q.remove();
                    if(temp != null) l.add(temp.val);
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
                ll.add(l);
            }
        }
        return ll;
    }
}