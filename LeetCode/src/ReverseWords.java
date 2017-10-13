/**
 * LeetCode 557
 * @author siddharth
 *
 */
public class ReverseWords {

	public String reverseWords(String s) {
		String words[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(new StringBuilder(word).reverse().toString() + " ");
		}
		return sb.substring(0, sb.length() - 1);
	}

}
