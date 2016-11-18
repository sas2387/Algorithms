/**
 * LeetCode
 * Problem 100
 * @author Siddharth
 *
 */
public class SameTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		/*
		 * preorder traversal of both the trees would identify same tree
		 */
		if (p != null && q != null) {
			if (p.val == q.val) {
				/* inorder traversal */
				if (!isSameTree(p.left, q.left))
					return false;
				if (!isSameTree(p.right, q.right))
					return false;
				return true;
			} else
				return false;
		} else {
			return p == null && q == null;
		}
	}

}
