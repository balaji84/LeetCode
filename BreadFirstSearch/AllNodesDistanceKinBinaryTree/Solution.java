package sample;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Sample {
	Map<TreeNode, Integer> map = new HashMap<>();

	public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		List<Integer> res = new LinkedList<>();
		find(root, target);
		dfs(root, target, K, map.get(root), res);
		return res;
	}

	// find target node first and store the distance in that path that we could use
	// it later directly
	private int find(TreeNode root, TreeNode target) {
		if (root == null)
			return -1;
		if (root == target) {
			map.put(root, 0);
			return 0;
		}
		int left = find(root.left, target);
		if (left >= 0) {
			map.put(root, left + 1);
			return left + 1;
		}
		int right = find(root.right, target);
		if (right >= 0) {
			map.put(root, right + 1);
			return right + 1;
		}
		return -1;
	}

	private void dfs(TreeNode root, TreeNode target, int K, int length, List<Integer> res) {
		if (root == null)
			return;
		if (map.get(root) != null)
			length = map.get(root);
		if (length == K)
			res.add(root.val);
		dfs(root.left, target, K, length + 1, res);
		dfs(root.right, target, K, length + 1, res);
	}
	
	public static void main(String args[]) {
		//[3,5,1,6,2,0,8,null,null,7,4]
		//		5
		//		2
		TreeNode node= new TreeNode(3);
		node.left = new TreeNode(5);
		node.right = new TreeNode(1);
		
		node.left.left = new TreeNode(6);
		node.left.right = new TreeNode(2);
		
		node.right.left= new TreeNode(0);
		node.right.right = new TreeNode(8);
		
		node.left.left.left= null;
		node.left.left.right = null;
		
		
		node.left.right.left= new TreeNode(7);
		node.left.right.right = new TreeNode(4);
	  
		//[3,5,1,6,2,0,8,null,null,7,4]
		//5
		//2
		
		//        3
		//      /   \
        //     5     1
		//    / \   / \ 
		//   6   2 6   8
		//      / \
	    //     7   4
		//Test case 1
		TreeNode target = node.left;
		List<Integer> list =new Sample().distanceK(node, target, 2);
		System.out.println(list);
		
		
		//[0,null,1,null,2,null,3]
		//		1
		//		2
		
		//     0
		//       \
		//        1
		//         \
		//          2
		//           \
		//            3
		
		
		
		//Test Case extreme caes
		TreeNode node1= new TreeNode(0);
		node1.left = null;
		node1.right = new TreeNode(1);
		node1.right.left = null;
		node1.right.right = new TreeNode(2);
		node1.right.right.left = null;
		node1.right.right.right = new TreeNode(3);
		TreeNode target1 = node1.right;
		List<Integer> list1 =new Sample().distanceK(node1, target1, 2);
		
		System.out.println("Sample.main()"+list1);
		
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
