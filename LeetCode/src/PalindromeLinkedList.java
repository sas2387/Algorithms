/**
 * LeetCode
 * Problem 234
 * @author Siddharth
 *
 */
public class PalindromeLinkedList {

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
		ListNode l4 = new ListNode(20);
		ListNode l5 = new ListNode(10);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		PalindromeLinkedList pll = new PalindromeLinkedList();
		pll.isPalindrome(l1);

	}

	public boolean isPalindrome(ListNode head) {
		int count = 0;
		ListNode traverser = head;
		while (traverser != null) {
			count++;
			traverser = traverser.next;
		}
		int half = count / 2;
		int index = 1;
		traverser = head;
		while (index <= half) {
			traverser = traverser.next;
			index++;
		}
		System.out.println(traverser.val);
		ListNode secondhead = reverseList(traverser);
		while (head != null && secondhead != null) {
			if (head.val != secondhead.val)
				return false;
			else {
				head = head.next;
				secondhead = secondhead.next;
			}
		}

		return true;
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
