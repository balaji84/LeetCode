

 
  
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
