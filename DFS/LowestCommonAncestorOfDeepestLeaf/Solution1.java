/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //Runtime: 5 ms, faster than 8.11% of Java online submissions for Lowest Common Ancestor of Deepest Leaves.
//Memory Usage: 39.4 MB, less than 100.00%
class Solution {
    //parameterized max instead of global variable
     TreeNode node = null;
     public TreeNode lcaDeepestLeaves(TreeNode root) {
       
        if(root ==null) return null;
        int max[] = new int[1];
        lca(root,0,max);
        
        return node;
    }
    
    private int lca(TreeNode root,int depth, int max[]){

        max[0] = Math.max(max[0],depth);
        
        if(root == null)return depth;
        
        int left = lca(root.left, depth+1,max);
        int right = lca(root.right,depth+1,max);
        
        if(left==max[0] && right == max[0]){
         
            node = root;
        }
        
        return Math.max(left,right);
        
        
    }
    
  
}
