/**
 * LeetCode
 * Problem 405
 * @author Siddharth
 *
 */
public class NumToHexa {

	public static void main(String[] args) {
		NumToHexa nth = new NumToHexa();
		System.out.println(nth.toHex(111111));
	}

	public String toHex(int num) {
		StringBuilder sb = new StringBuilder();
		if (num == 0)
			return "0";
		else {
			int value = 0;
			for (int i = 0; i < 32; i++) {
				if ((num & 1 << i) != 0)
					value += Math.pow(2, i % 4);
				if ((i + 1) % 4 == 0) {
					sb.insert(0, charOf(value));
					value = 0;
				}
			}
			if (value != 0) {
				sb.insert(0, charOf(value));
			}
		}
		
		int j = 0;
		while (j < sb.length()) {
			if (sb.charAt(j) == '0')
				sb.deleteCharAt(0);
			else
				break;
		}
		return sb.toString();
	}

	char charOf(int value) {
		return Character.forDigit(value, 16);
	}

}
