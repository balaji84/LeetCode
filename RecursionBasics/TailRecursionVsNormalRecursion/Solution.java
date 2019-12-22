package sample;

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
public class PathSum {
    public int hasPathSum(TreeNode A, int B) {
        
        if(A==null){
            return 0;
        }
        
        
        //return helper(A,B)?1:0;
        return helper1(A,B)?1:0;
    }
    private boolean helper(TreeNode A , int target){
    	System.out.println("  >>Tail:"+A.val);
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
    
    private boolean helper1(TreeNode A , int target){
        if(A==null)return false;
        System.out.println(" Normal:"+A.val);
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
        boolean result = helper(A.left,target-A.val);
        if(!result)
        result = helper(A.right,target-A.val);
        return result;
    }
    
    public static void main(String args[]) {
    	
    	Thread t = new Thread();
    	
    	TreeNode A = new TreeNode(1000);
    	A.left = new TreeNode(2000);
    	//A.right= new TreeNode(-1);
    	A.left.left = new TreeNode(-3001);
    	System.out.println("=======TAIL RECURSION BEGIN =========");
    	boolean result = new PathSum().helper(A, -1);
    	System.out.println("=======END =========");
    	
    	
    	System.out.println("=======NORMAL RECURSION BEGIN =========");
    	
    	boolean result1 = new PathSum().helper1(A, -1);
    	System.out.println("tailRecursion:"+result);
    	System.out.println("=======NORMAL RECURSION END =========");
    	System.out.println("normal Recursion:"+result1);
    }
}
