/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Difference Between Node and Ancestor.
//Memory Usage: 36 MB, less than 100.00% of Java online submissions for Maximum Difference Between Node and
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        
       return helper(root,root.val,root.val,0);
    }
    
    private int helper(TreeNode root, int min, int max,int totmax){
        if(root ==null)return 0;
          min = Math.min(root.val, min);
        max = Math.max(root.val, max);    
        totmax = Math.max(Math.abs(root.val -min),totmax);
        totmax = Math.max(Math.abs(root.val -max),totmax);
       
             

       totmax = Math.max(totmax,helper(root.left,min,max,totmax));
        totmax = Math.max(totmax,helper(root.right,min,max,totmax));
        // 1
        // /\    
        //   2
        //   /\
        //     0
        //    / \
        //       3 
        //0-3=3(All right)
        
         //     8
         //    / \
         //   3   10
         //  /\   /\    
         // 1  6    14
         // /\ /\   / \
         //   4  7 13  null
         //8-1=7(All left)
        
        
            //      2
            //    /  \
            //   5     0
            //  /\    / \    
            //       4 
            //      / \
            //     6
            //    / \
            //    1 
            //     \
            //      3
        
           //0-6=6 (right,left,)
        return totmax;
    }
}
