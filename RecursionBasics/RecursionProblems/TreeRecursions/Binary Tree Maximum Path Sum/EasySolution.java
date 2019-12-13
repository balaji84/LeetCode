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
  //  Runtime: 1 ms, faster than 99.75% of Java online submissions for Binary Tree Maximum Path Sum.
//Memory Usage: 40.4 MB, less than 94.05% of Java online submissions for Binary Tree Maximum Path Sum.

       int ret = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return ret;
    }
    
    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        //[2,-1] input we need the below conditions (left<0) , right<0
        //below Math.max(root.val, Math.max(root.val+left, root.val+right))  assigned to left
        int left = helper(root.left); 
        int right = helper(root.right);
        // Computes the max ret it could get in current recursion
        if (left < 0) {
            ret = Math.max(ret, Math.max(root.val, root.val+right));
        } else if (right < 0) {
            ret = Math.max(ret, Math.max(root.val, root.val+left));
        } else {
            ret = Math.max(ret, left+root.val+right);
        }
        
        // Returns the largest path starting with current node,
        // It could be the single node, or the node + left or right path
        return Math.max(root.val, Math.max(root.val+left, root.val+right));
    }

}
