/**
 * LeetCode Problem 654
 * @author siddharth
 *
 */
public class MaxTree {

	/*
	 * Output: return the tree root node representing the following tree:
	 * 
	 * 6 / \ 3 5 \ / 2 0 \ 1
	 */

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		TreeNode root = null;
		TreeNode node = null;

		for (int n : nums) {
			if (root == null) {
				root = new TreeNode(n);
			} else if (root.val > n) {
				node = root;
				while (node.right != null && node.right.val > n) {
					node = node.right;
				}
				if (node.right == null) {
					TreeNode newNode = new TreeNode(n);
					node.right = newNode;
				} else {
					TreeNode newNode = new TreeNode(n);
					newNode.left = node.right;
					node.right = newNode;
				}
			} else {
				node = new TreeNode(n);
				node.left = root;
				root = node;
			}
		}

		return root;
	}

}
