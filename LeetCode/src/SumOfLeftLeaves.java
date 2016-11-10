/**
 * LeetCode 
 * Problem 404
 * @author Siddharth
 * 
 */
public class SumOfLeftLeaves {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int sum = 0;

	// Further improvement are required
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		TreeNode node_left = root.left;
		TreeNode node_right = root.right;
		if (node_left != null) {
			if (node_left.left == null && node_left.right == null) {
				sum += node_left.val;
			} else {
				sumOfLeftLeaves(node_left);
			}
		}

		if (node_right != null) {
			sumOfLeftLeaves(node_right);
		}
		return sum;
	}

}
