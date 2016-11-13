/**
 * LeetCode
 * Problem 206
 * @author siddharthshah
 *
 */
public class ReverseLinkedList {

	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(10);
		ListNode l2 = new ListNode(20);
		ListNode l3 = new ListNode(30);
		l1.next = l2;
		l2.next = l3;
		ReverseLinkedList rll = new ReverseLinkedList();
		ListNode rv = rll.reverseList(l1);

		while (rv != null) {
			System.out.print(rv.val + "->");
			rv = rv.next;
		}

	}

	public ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}

		if (head.next == null) {
			return head;
		}

		ListNode prev = head;
		ListNode traverser = prev.next;
		ListNode next;
		prev.next = null;

		while (traverser.next != null) {
			next = traverser.next;
			traverser.next = prev;
			prev = traverser;
			traverser = next;
		}
		traverser.next = prev;

		return traverser;
	}

}
