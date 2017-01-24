/**
 * LeetCode Problem 237
 * Solution : Since you are only given the node to be
 * deleted and you are not using C (so there is no direct memory referencing,
 * what you can do is move the the values of the linked list and make the last
 * element of the linked list(unless tail)
 * 
 * @author Siddharth Shah
 *
 */
public class DeleteNode {

	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void deleteNode(ListNode node) {
		while (node.next.next != null) {
			ListNode nextNode = node.next;
			node.val = nextNode.val;
			node = nextNode;
		}
		node.val = node.next.val;
		node.next = null;
	}

}
