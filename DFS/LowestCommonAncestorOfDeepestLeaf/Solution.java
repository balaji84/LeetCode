/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Runtime: 5 ms, faster than 100% of Java online submissions for Lowest Common Ancestor of Deepest Leaves.
//Memory Usage: 39.4 MB, less than 100.00% of Ja
class Solution {
    
    TreeNode node = null;
    int max =0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        if(root ==null) return null;
        
        lca(root,0,0);
        
        return node;
    }
    
    private int lca(TreeNode root,int depth, int max1){

        max = Math.max(max,depth);
        
        if(root == null)return depth;
        
        int left = lca(root.left, depth+1,max);
        int right = lca(root.right,depth+1,max);
        
        if(left==max && right == max){
            node = root;
            
        }
        
        return Math.max(left,right);
        
        
    }
}
