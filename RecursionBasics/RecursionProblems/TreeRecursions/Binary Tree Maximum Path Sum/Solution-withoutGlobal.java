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
//Memory Usage: 40.4 MB, less than 95.24% of Java online submissions for Binary Tree Maximum Path Sum.

class Solution {
    
    public int maxPathSum(TreeNode root) {
        if(root == null)return 0;
        
            int max[]=new int[1];
                    max[0]=Integer.MIN_VALUE;
         helper(root,max);
        return max[0];
    }
    
    private int helper(TreeNode root,int[] max){
        
        if(root == null)return 0;

        int left= Math.max(0, helper(root.left,max));
        int right= Math.max(0,helper(root.right,max));
        max[0]  = Math.max(max[0],left+right+root.val);
        
        return Math.max(left,right)+root.val;
    }
}
