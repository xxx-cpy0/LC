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
    public TreeNode helper(int[] arr,int l,int h,TreeNode root){
        if(l > h) return null;
        if(l == h) return new TreeNode(arr[l]);
        int mid = 0;
        for(int i=l+1;i<=h;i++){
            if(arr[i] > arr[l]){
                mid = i;
                break;
            }
        }
        root = new TreeNode(arr[l]);
        if(mid == 0){
            root.left = helper(arr,l+1,h,root);
            root.right = null;
        }
        else{
            root.left = helper(arr,l+1,mid-1,root);
            root.right = helper(arr,mid,h,root);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode();
        return helper(preorder,0,preorder.length - 1,root);
    }
}