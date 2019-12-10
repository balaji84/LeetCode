
Note:
=====

same logic as MaxDepthOfRecursion 

    public int maxDepth(TreeNode root) {
         
        if(root==null){
            return 0;
        }
        int left = 1+maxDepth(root.left);
        int right = 1+maxDepth(root.right);
        
          System.out.println("root:"+root.val + " left:"+left + " right:"+right);
        
        return Math.max(left , right);
        
    }
    
    input : [3,9,20,null,null,15,7]
    
    output:
    =====
    root:9 left:1 right:1
    root:15 left:1 right:1
    root:7 left:1 right:1
    root:20 left:2 right:2
    root:3 left:2 right:3
    
    
left never gets updated it is always 1. because output depends on return return Math.abs(left-right); if changed to
Math.max(left,right) then above will come.
 
  
     class Solution {
        int left =1, right = 1;
        public boolean isBalanced(TreeNode root) {

            return helper(root)<=1?true:false;
        }

        private int helper(TreeNode root){
            if(root == null)return 0;
                    System.out.println(" = root:"+root.val);

            int left = 1+ helper(root.left);
                System.out.println("left11111:"+left );
                //only on returning value of left gets updated
            right = 1+ helper(root.right);
        System.out.println("left:"+left + " right:"+right);


            return Math.abs(left-right);
        }
    }

output:
=======
                       = root:3
                       = root:9
                      left11111:1
                      left:1 right:1
                      left11111:1
                       = root:20
                       = root:15
                      left11111:1
                      left:1 right:1
                      left11111:1
                       = root:7


Version 2:
==========

   Now added 1+ in return  it gets updated.

     class Solution {
        int left =1, right = 1;
        public boolean isBalanced(TreeNode root) {

            return helper(root)<=1?true:false;
        }

        private int helper(TreeNode root){
            if(root == null)return 0;
                    System.out.println(" = root:"+root.val);

            int left = 1+ helper(root.left);
                System.out.println("left11111:"+left );
                //only on returning value of left gets updated
            right = 1+ helper(root.right);
        System.out.println("left:"+left + " right:"+right);



            return 1+ Math.abs(left-right);//change
        }
    }



                      = root:3
                       = root:9
                      left11111:2
                      left:1 right:1 //after right return ,left it is still 1
                      
