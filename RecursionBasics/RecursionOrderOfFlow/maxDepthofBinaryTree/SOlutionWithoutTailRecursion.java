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
    public int maxDepth(TreeNode root) {
        
        if(root == null)return 0;
         int val = root.val;
        
        int left = maxDepth(root.left); //step 1
        
        int right = maxDepth(root.right);//step 2
        
        //step 3: begin
        int height = 0;
        if(left>right){
           height= 1+ left;
        }else{
            height = 1+ right;
        }
        //step3 : end
        
        return height;
    }
}

outptut:
========

         root3
        root9
        root15
           returning Root:15 left:0 right:0 height:1
        root7
           returning Root:7 left:0 right:0 height:1
           returning Root:9 left:1 right:1 height:2
        root20
           returning Root:20 left:0 right:0 height:1
           returning Root:3 left:2 right:1 height:3


                              3(1,2,3)
                             / \
                    (1,2,3) 9   20 (1,2,3)
                           / \
                  (1,2,3) 15  7(1,2,3)
                         / \     
                      null  null 
                    (1,2,3)  (1,2,3)      
      Flow:
      =====
      
      Flow 1:
      =======
            level 0:
            ========

            3 -root (step 1) execute

           level 1:
           ========
            9- as root( step 1 ) execute

           level 2:
           =======
             15 as root(step 1 execute)
             since step 1 left is null it is completed.
              go to to step 2 - since right is also null it is complted
              go to to step 3 - processing end is since left and right is 0 then becomes right =1;
              return 1;
     Flow 2:
     =======
     
          + = completed
          * = running.
     
                          3(1+,2,3)
                             / \
                  (1+,2*,3) 9   20 (1,2,3)
                           / \
               (1+,2+,3+) 15  7(1*,2*,3*)
                         / \  / \   
                        /   \null null
                      null  null
          
         
            root3
            root9
            root15
               returning Root:15 left:0 right:0 height:1
            root7
               returning Root:7 left:0 right:0 height:1
               returning Root:9 left:1 right:1 height:2
            root20
               returning Root:20 left:0 right:0 height:1
               returning Root:3 left:2 right:1 height:3
         
         
         
           15(step1,step2,step3 ) is finished return back to 9 .
           
           since step1 of 9 already finished started processing -step 2  - right 7
            - 7left - left:0, right:0   return 1;
            - 7 right - left:1,right 1 return 2;  
         
         
        Flow 3:
        ======
                          3(1+,2*,3*)
                             / \
                 (1+,2+,3+) 9   20 (1*,2*,3*)
                           / \
               (1+,2+,3+) 15  7(1+,2+,3+)
                         / \  / \   
                        /   \null null
                      null  null
          
          since step1 of 9 already finished started processing -step 2  - right 7
             
              - returning Root:20 left:0 right:0 height:1
              - returning Root:3 left:2 right:1 height:3
         
