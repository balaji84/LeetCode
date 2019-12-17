
Recursion still left or right   end of tree reaches:
=====================================================

       class Solution {
        public int maxAncestorDiff(TreeNode root) {

           return helper(root,root.val,0);
        }
    
    private int helper(TreeNode root,int val,int max){
        if(root ==null)return 0;
        
        
        
        max = Math.max(Math.abs(root.val -val),max);
        System.out.println(max);
        int left = Math.max(max,helper(root.left,val,max));
        int right = Math.max(max,helper(root.right,val,max));
        //max value will updated upwards but wont have latest will returning.
        
        return max;
    }
}

Flow when recursion returns:
============================

     private int helper(TreeNode root,int val,int max){
        if(root ==null)return 0;
        
        
        
        max = Math.max(Math.abs(root.val -val),max);
        System.out.println(max);
        max = Math.max(max,helper(root.left,val,max));
        max = Math.max(max,helper(root.right,val,max));
        //now max will be latest when traversing upwards and returning.
        
        return max;
    }
