/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        
        if(A==null){
            return 0;
        }
        
        
        return helper(A,B)?1:0;
    }
    private boolean helper(TreeNode A , int target){
        if(A==null)return false;
        
        //for negative values just add target-A.val instead of target ==0
       if(A!=null && A.left==null && A.right==null && target-A.val==0){
            return true;
        }
        
        
        
        //         1000
        //         /   \
        //      2000    -1
        //       / \     /\
        //   -3001  -1 -1 -1
        //target -1
        //-1-1000 = -1001 ,
        //-1001-(2000)=-3001
        //-3001-(-3001)= -1
        return helper(A.left,target-A.val)|| helper(A.right,target-A.val);
    }
}
