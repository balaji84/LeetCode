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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        helper(result,list, root , sum);
        
        return result;
    }
    
    
    
    private void helper(List<List<Integer>> result,
             List<Integer> list,     TreeNode root, int sum){
        if(root == null)return ;
        list.add(root.val);
        
        if(root.left == null && root.right==null && sum-root.val == 0){
            result.add(new ArrayList<Integer>(list));
        }
        
       
        helper(result,list,root.left,sum-root.val);
        helper(result,list,root.right,sum-root.val);
        
        list.remove(list.size()-1);//delete last left node adding right node
    }
    
    
}
