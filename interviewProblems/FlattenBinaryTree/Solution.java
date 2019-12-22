/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode flatten(TreeNode a) {
        if(a==null)return null;
        
     TreeNode node =  helper(a,null);
     return node;
    }
    
    private TreeNode helper(TreeNode root, TreeNode tail){
        if(root == null)return tail;
        
        tail = helper(root.right,tail);
        root.right= helper(root.left,tail);
        root.left= null;
        
        return root;
    }
    
}
