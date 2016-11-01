import java.util.ArrayDeque;
/**
 * LeetCode
 * Problem 394
 * @author Siddharth
 *
 */
public class DecodeString {

	public static void main(String[] args) {
		DecodeString ds = new DecodeString();
		System.out.println(ds.decodeString("3[a]2[bc]"));
		System.out.println(ds.decodeString("3[a2[c]]"));
		System.out.println(ds.decodeString("2[abc]3[cd]ef"));
	}

	public String decodeString(String s) {
		// Used an double ended queue that works as both
		// A queue and a stack
		ArrayDeque<String> deque = new ArrayDeque<>();
		int number = 0;
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			// if the current letter is number we need to
			// push the current buffer to the dequeue
			if (c >= '0' && c <= '9') {
				// if there is pending buffer add to the dequeue
				if (sb.length() != 0) {
					deque.add(sb.toString());
					sb = new StringBuilder();
				}
				// There might be multiple digits so using decimal increment
				number = (number * 10) + (c - (int) '0');
			} else if (c == '[') {
				// "[" will always be preceded by a number
				// according to the problem statement
				// so popping that number
				if (number != 0) {
					deque.add(String.valueOf(number));
					number = 0;
				}
				deque.add("[");
			} else if (c >= 'a' && c <= 'z') {
				// building string of characters
				sb.append(c);
			} else if (c == ']') {
				String str = deque.removeLast();
				// popping till we find "["
				while (!str.equals("[")) {
					// adding strings in front of the stringbuilder
					sb.insert(0, str);
					str = deque.removeLast();
				}
				// repeating the given string and adding back to the dequeue
				try {
					int times = Integer.parseInt(deque.removeLast());
					String repeated = new String(new char[times])
							.replace("\0", sb.toString());
					deque.add(repeated);
					sb = new StringBuilder();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		// there might be remaining strings at the end
		if (sb.length() != 0)
			deque.add(sb.toString());

		StringBuilder answer = new StringBuilder();
		while (deque.size() != 0)
			for (int i = 0; i < deque.size(); i++) {
				answer.append(deque.remove());
			}

		return answer.toString();
	}
}
