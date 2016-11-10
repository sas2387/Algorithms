/**
 * LeetCode
 * Problem 409
 * @author Siddharth
 *
 */
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		FirstUniqueCharacter fuc = new FirstUniqueCharacter();
		System.out.println(fuc.firstUniqChar("leetcode"));
		System.out.println(fuc.firstUniqChar("loveleetcode"));
	}

	public int firstUniqChar(String s) {
		int lettercount[] = new int[26];

		char letter[] = s.toCharArray();

		for (char c : letter) {
			lettercount[(int) c - (int) 'a']++;
		}

		for (int i = 0; i < letter.length; i++) {
			int freq = lettercount[(int) letter[i] - (int) 'a'];
			if (freq == 1)
				return i;
		}

		return -1;
	}

}
