/**
 * LeetCode
 * Problem 345
 * @author Siddharth
 *
 */
public class ReverseVowels {

	public static void main(String[] args) {
		ReverseVowels rv = new ReverseVowels();
		System.out.println(rv.reverseVowels("leetcode"));
	}

	public String reverseVowels(String s) {
		char c[] = s.toCharArray();
		int i = getNextVowel(-1, c);
		int j = getPrevVowel(c.length, c);
		char temp;
		while (i < j) {
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i = getNextVowel(i, c);
			j = getPrevVowel(j, c);
		}

		return new String(c);
	}

	private int getNextVowel(int start, char c[]) {
		int i = start + 1;
		while (i < c.length) {
			switch (c[i]) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				return i;
			default:
				i++;
			}
		}
		return i;
	}

	private int getPrevVowel(int end, char c[]) {
		int i = end - 1;
		while (i > 0) {
			switch (c[i]) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				return i;
			default:
				i--;
			}
		}
		return i;
	}

}
