/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
  //same way as maxDepthOf binary Tree 
 //Runtime: 1 ms, faster than 99.59% of Java online submissions for Balanced Binary Tree.
//Memory Usage: 37.9 MB, less than 95.37% of Java online submissions for Balanced Binary Tree.
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
        int right = height(root.right);
        if(left ==-1) return -1;
        
         if(right ==-1) return -1;
        if(Math.abs(left-right)>1)return -1;
        
        return 1+Math.max(left,right);
    }
}
