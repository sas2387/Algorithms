/**
 * LeetCode
 * Problem 104
 * @author Siddharth
 *
 */
public class MaxDepthOfBinTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root != null) {
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		} else {
			return 0;
		}
	}

}
