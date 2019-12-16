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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int pst = 0;
        int pend = preorder.length-1;
        
        int inst = 0;
        int inend = inorder.length-1;
        
        Map<Integer,Integer> inmap = new HashMap<>();
        for(int i=0;i<=inend;i++){
              inmap.put(inorder[i], i);
            
        }
        
        
        return helper(preorder, pst,pend, inorder,inst,inend,inmap); 
    }
    
    private TreeNode helper(int[] preorder,int pst, int pend, int[] inorder,int inst,int inend,Map<Integer,Integer> inmap ){
        
        if(pst>pend || inst>inend)return null;
             
        
        TreeNode result = new TreeNode(preorder[pst]);

        int index = 0; // Index of current root in inorder
        index = inmap.get(result.val);
        
        result.left =  helper(preorder,pst+1,pend,inorder,inst,index-1, inmap);
        result.right =  helper(preorder,pst+index-inst+1,pend,inorder,index+1,inend, inmap);
        
        return result;

    }
}
