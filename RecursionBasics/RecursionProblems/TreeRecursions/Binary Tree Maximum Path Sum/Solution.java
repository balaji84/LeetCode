/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //Runtime: 1 ms, faster than 99.75% of Java online submissions for Binary Tree Maximum Path Sum.
//Memory Usage: 40.9 MB, less than 64.29% of Java online submissions for Binary Tree Maximum Path Sum.

class Solution {
    int max =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null)return 0;
        
         helper(root);
        return max;
    }
    
    private int helper(TreeNode root){
        
        if(root == null)return 0;

        int left= Math.max(0, helper(root.left));
        int right= Math.max(0,helper(root.right));
        max  = Math.max(max,left+right+root.val);
        
        return Math.max(left,right)+root.val;
    }
}
