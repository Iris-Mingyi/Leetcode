/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
 Because we traverse the entire input tree once, the total run time is O(n) where n is the total number of nodes in the tree.
 */

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    
    public boolean helper(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        return ((r1.val == r2.val) && helper(r1.left, r2.right) && helper(r1.right, r2.left));
    }
}
