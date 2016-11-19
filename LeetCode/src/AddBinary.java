/**
 * LeetCode
 * Problem 67
 * @author Siddharth
 *
 */
public class AddBinary {

	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary("100", "111"));
	}

	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		char achar[] = a.toCharArray();
		char bchar[] = b.toCharArray();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int int_a, int_b;
		int carry = 0;
		int sum = 0;

		while (i > -1 && j > -1) {
			int_a = achar[i] - '0';
			int_b = bchar[j] - '0';
			sum = int_a + int_b + carry;
			carry = sum / 2;
			sb.append((char) ('0' + (sum % 2)));
			i--;
			j--;
		}

		while (i > -1) {
			int_a = achar[i] - '0';
			sum = int_a + carry;
			carry = sum / 2;
			sb.append((char) ('0' + (sum % 2)));
			i--;
		}
		while (j > -1) {
			int_b = bchar[j] - '0';
			sum = int_b + carry;
			carry = sum / 2;
			sb.append((char) ('0' + carry));
			j--;
		}
		if (carry != 0)
			sb.append(Character.forDigit(carry, 10));

		return sb.reverse().toString();
	}

}
