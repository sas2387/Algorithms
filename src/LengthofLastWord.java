/**
 * LeetCode
 * Problem 58
 * @author Siddharth
 *
 */
public class LengthofLastWord {

	public static void main(String[] args) {
		LengthofLastWord lolw = new LengthofLastWord();
		System.out.println(lolw.lengthOfLastWord("a"));
	}

	public int lengthOfLastWord(String s) {
		int count = 0;
		s = s.trim();
		char c[] = s.toCharArray();
		for (int i = c.length - 1; i > -1; i--) {
			if (c[i] == ' ')
				return count;
			count++;
		}

		return count;
	}
}
