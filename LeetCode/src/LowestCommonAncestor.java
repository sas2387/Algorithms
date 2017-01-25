/**
 * LeetCode Problem 235
 * @author Siddharth Shah
 *
 */
public class LowestCommonAncestor {

	static public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode current = root;

		while (!((p.val <= current.val && current.val <= q.val) || (q.val <= current.val && current.val <= p.val))) {
			if (p.val < current.val) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return current;
	}

}
