import java.util.Arrays;

/**
 * LeetCode
 * Problem 389
 * @author siddharthshah
 *
 */
public class FindDifference {
	public static void main(String[] args) {
		FindDifference fd = new FindDifference();
		System.out.println(fd.findTheDifference("sid", "sidd"));
	}

	public char findTheDifference(String s, String t) {
		char schar[] = s.toCharArray();
		char tchar[] = t.toCharArray();
		Arrays.sort(schar);
		Arrays.sort(tchar);

		for (int i = 0; i < schar.length; i++) {
			if (schar[i] != tchar[i])
				return tchar[i];
		}
		return tchar[tchar.length - 1];
	}
}
