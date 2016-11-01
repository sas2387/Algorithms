/**
 * LeetCode
 * Problem 383
 * @author Siddharth
 *
 */
public class RansomNote {

	public static void main(String[] args) {
		RansomNote r = new RansomNote();
		System.out.println(r.canConstruct("a", "b"));
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		int count[] = new int[26];

		for (char c : magazine.toCharArray()) {
			count[(int) c - (int) 'a']++;
		}

		for (char c : ransomNote.toCharArray()) {
			count[(int) c - (int) 'a']--;
			if (count[(int) c - (int) 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
