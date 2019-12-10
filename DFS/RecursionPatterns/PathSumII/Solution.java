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
        sum = sum-root.val;
         list.add(root.val);
        if(root.left == null && root.right==null && sum == 0){
            result.add(new ArrayList<Integer>(list));
        }
        
       
        helper(result,list,root.left,sum);
        helper(result,list,root.right,sum);
        
        list.remove(list.size()-1);
    }
    
    
}
