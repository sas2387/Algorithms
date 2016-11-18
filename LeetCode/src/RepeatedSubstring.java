/**
 * LeetCode
 * Problem 459
 * @author Siddharth
 *
 */
public class RepeatedSubstring {

	public static void main(String[] args) {
		RepeatedSubstring rs = new RepeatedSubstring();
		System.out.println(rs.repeatedSubstringPattern("abababab"));
		System.out.println(rs.repeatedSubstringPattern("abcabcabcabc"));
		System.out.println(rs.repeatedSubstringPattern("abcabcabc"));
		System.out.println(rs.repeatedSubstringPattern("abcabcabd"));
		System.out.println(rs.repeatedSubstringPattern("abcabdabc"));
	}

	public boolean repeatedSubstringPattern(String str) {
		if (str.length() == 1)
			return false;

		char c[] = str.toCharArray();
		if (str.length() % 2 == 0) {
			int index1 = 0;
			int index2 = c.length / 2;
			while (index2 < c.length) {
				if (c[index1] != c[index2])
					return false;
				index1++;
				index2++;
			}
		} else {
			int index1 = 0;
			/* we set a limit to how many letters we can skip */
			/* the actual limit can be lower, but we are taking safer case */
			int limit = c.length / 3;
			/* we would start matching from second half of the array */
			int index2 = c.length / 2 + 1;
			int start2 = index2;
			while (index2 < c.length) {
				if (c[index1] != c[index2]) {
					if (limit < 0) {
						/* check if we have crossed the mismatch limit */
						return false;
					} else {
						/* mismatch found */
						/* we will see if we can find another matching */
						index2++;
						start2 = index2;
						limit--;
					}
				} else {
					index1++;
					index2++;
					limit--;
				}
			}
			int middleindex = index1;
			index1 = 0;
			/* check for remaining matching */
			/* to check whether the middle pattern we left is also repeating */
			while (middleindex < start2) {
				if (c[index1] != c[middleindex])
					return false;
				index1++;
				middleindex++;
			}

		}
		return true;
	}

}
