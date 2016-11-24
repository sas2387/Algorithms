import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problem 225
 * @author Siddharth
 *
 */
public class StackUsingQueue {

	List<Integer> queue = new ArrayList();

	// Push element x onto stack.
	public void push(int x) {
		queue.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		queue.remove(queue.size() - 1);
	}

	// Get the top element.
	public int top() {
		return queue.get(queue.size() - 1);
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}

}
