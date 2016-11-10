/**
 * LeetCode
 * Problem 242
 * @author Siddharth
 *
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {

		char schar[] = s.toCharArray();
		char tchar[] = t.toCharArray();

		int count1[] = new int[26];
		int count2[] = new int[26];

		for (char c : schar) {
			count1[(int) c - (int) 'a']++;
		}

		for (char c : tchar) {
			count2[(int) c - (int) 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (count1[i] != count2[i])
				return false;
		}

		return true;

	}
}
