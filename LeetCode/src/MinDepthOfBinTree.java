/**
 * LeetCode Problem 111
 * @author Siddharth
 *
 */
public class MinDepthOfBinTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int minDepth(TreeNode root) {
		if (root != null) {
			int minDepthLeft = minDepth(root.left);
			int minDepthRight = minDepth(root.right);
			if (minDepthLeft != 0 && minDepthRight != 0)
				return 1 + Math.min(minDepthLeft, minDepthRight);
			else if (minDepthLeft != 0)
				return 1 + minDepthLeft;
			else
				return 1 + minDepthRight;

		} else {
			return 0;
		}
	}

}
