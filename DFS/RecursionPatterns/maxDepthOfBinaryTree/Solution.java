/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 39.1 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.

class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int left = 1+maxDepth(root.left);
        int right = 1+maxDepth(root.right);
        
          System.out.println("root:"+root.val + " left:"+left + " right:"+right);
        
        return Math.max(left , right);
        
    }
}
