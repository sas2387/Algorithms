/**
 * LeetCode
 * Problem 83
 * @author Siddharth
 *
 */
public class RemoveDuplicate {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null) {
			return null;
		}
		ListNode node1 = head;
		ListNode node2 = head.next;
		while (node2 != null) {
			if (node2.val == node1.val) {
				node1.next = node2.next;
				node2 = node1.next;
			} else {
				node1 = node2;
				node2 = node1.next;
			}
		}

		return head;

	}
}
