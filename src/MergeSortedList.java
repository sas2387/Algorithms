/**
 * LeetCode
 * Problem 21
 * @author Siddharth
 *
 */
public class MergeSortedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// No testcases written
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null, current = null;
		ListNode c1, c2;
		c1 = l1;
		c2 = l2;
		if (c1 != null && c2 != null) {
			if (c1.val < c2.val) {
				result = c1;
				current = result;
				c1 = l1.next;
				l1 = c1;
			} else {
				result = c2;
				current = result;
				c2 = l2.next;
				l2 = c2;
			}
		} else if (c1 == null) {
			result = c2;
			return result;
		} else if (c2 == null) {
			result = c1;
			return result;
		}

		while (c1 != null && c2 != null) {
			if (c1.val < c2.val) {
				current.next = c1;
				current = current.next;
				c1 = l1.next;
				l1 = c1;
			} else {
				current.next = c2;
				current = current.next;
				c2 = l2.next;
				l2 = c2;
			}
		}

		if (c1 != null) {
			current.next = c1;
		}

		if (c2 != null) {
			current.next = c2;
		}

		return result;
	}

}
