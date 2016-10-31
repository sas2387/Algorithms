/**
 * LeetCode
 * Problem 387
 * @author Siddharth
 *
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("abccccdd"));
	}

	public int longestPalindrome(String s) {
		char letter[] = s.toCharArray();
		boolean flag = true;
		int upperCaseCount[] = new int[26];
		int lowerCaseCount[] = new int[26];
		int length = 0;

		for (int i = 0; i < letter.length; i++) {
			if ((int) letter[i] <= (int) 'Z') {
				upperCaseCount[(int) letter[i] - (int) 'A']++;
			} else {
				lowerCaseCount[(int) letter[i] - (int) 'a']++;
			}
		}

		for (int l : upperCaseCount) {
			if (l % 2 == 0) {
				length += l;
			} else {
				if (flag) {
					length += l;
					flag = false;
				} else {
					length += (l - 1);
				}
			}
		}

		for (int l : lowerCaseCount) {
			if (l % 2 == 0) {
				length += l;
			} else {
				if (flag) {
					length += l;
					flag = false;
				} else {
					length += (l - 1);
				}
			}
		}

		return length;
	}

}
