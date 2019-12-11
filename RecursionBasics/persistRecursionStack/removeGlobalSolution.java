class Solution {
 // Runtime: 419 ms, faster than 6.05% of Java online submissions for Target Sum.
//Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Target Sum.

    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) return 0;
        int count = helper(nums, S, 0, 0,0);
        return count;
    }
    
    public int helper(int[] nums, int target, int pos, long eval,int count){
        if (pos == nums.length) {
            if (target == eval) count++;
            return count;
        }
       count =  helper(nums, target, pos + 1, eval + nums[pos],count);
       count = helper(nums, target, pos + 1, eval - nums[pos],count);
        return count;
    }
}
