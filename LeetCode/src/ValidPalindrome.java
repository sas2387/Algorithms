/**
 * LeetCode
 * Problem 125
 * @author Siddharth
 *
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome("a."));
	}

	public boolean isPalindrome(String s) {
		s = s.trim();
		if (s.length() == 0)
			return true;
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (!isAlphaNumeric(s.charAt(i))) {
				i++;
				continue;
			}
			if (!isAlphaNumeric(s.charAt(j))) {
				j--;
				continue;
			}

			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	boolean isAlphaNumeric(char c) {
		return (c > 47 && c < 58) || (c > 96 && c < 123);
	}

}
