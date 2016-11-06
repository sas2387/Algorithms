/**
 * LeetCode
 * Problem 344
 * @author Siddharth
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("hello"));
	}

	public String reverseString(String s) {
		char letters[] = s.toCharArray();
		for (int i = 0; i < letters.length / 2; i++) {
			char c = letters[i];
			letters[i] = letters[letters.length - 1 - i];
			letters[letters.length - 1 - i] = c;
		}
		return new String(letters);
	}

}
