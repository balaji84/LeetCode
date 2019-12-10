blic int maxDepth(TreeNode root) {
     
    if(root==null){
        return 0;
    }
    int left = 1+maxDepth(root.left);
    int right = 1+maxDepth(root.right);
    
      System.out.println("root:"+root.val + " left:"+left + " right:"+right);
    
    return Math.max(left , right);
    
}
