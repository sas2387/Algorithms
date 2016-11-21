import java.util.Stack;

/**
 * LeetCode Problem 232
 * @author Siddharth
 *
 */
public class QueueUsingStack {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> temp = new Stack<>();

	// Push element x to the back of queue.
	public void push(int x) {
		stack.push(x);
		/*
		 * 2nd approach while (!stack.isEmpty()) { temp.push(stack.pop()); }
		 * stack.push(x); while (!temp.isEmpty()) { stack.push(temp.pop()); }
		 */
	}

	// Removes the element from in front of queue.
	public void pop() {

		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		temp.pop();
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		/*
		 * 2nd approach stack.pop();
		 */
	}

	// Get the front element.
	public int peek() {
		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		int value = temp.peek();
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return value;
		/*
		 * 2nd approach return stack.peep();
		 */
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return stack.isEmpty();
	}

}
