/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //Runtime: 1 ms, faster than 99.59% of Java online submissions for Balanced Binary Tree.
//Memory Usage: 39.3 MB, less than 75.00% of Java online submissions for Balanced Binary Tree.
//see stack frame increased so reduced to 90 to 75

class Solution {
    public boolean isBalanced(TreeNode root) {
     
        if(root == null){
            return true;
        }
        
    
        return height(root)==-1?false:true;
    }
    
    private int height(TreeNode root){
         
       if(root == null){
            return 0;
        }
        
        int left =  height(root.left);
        if(left ==-1) return -1; //see condition put before right iteration.
        int right = height(root.right);
        
        
         if(right ==-1) return -1;
        if(Math.abs(left-right)>1)return -1;
        
        return 1+Math.max(left,right);
    }
}
