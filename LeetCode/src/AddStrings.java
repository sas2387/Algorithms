/**
 * LeetCode
 * Problem 415
 * @author Siddharth
 *
 */
public class AddStrings {

	public static void main(String[] args) {
		AddStrings as = new AddStrings();
		System.out.println(as.addStrings("9", "99"));

	}

	public String addStrings(String num1, String num2) {
		char n1[] = num1.toCharArray();
		char n2[] = num2.toCharArray();

		int maxlength = (n1.length > n2.length) ? n1.length : n2.length;
		int carry = 0;
		int answer = 0;

		if (maxlength == n1.length) {
			int i = n1.length - 1;
			int j = n2.length - 1;

			while (j > -1) {
				answer = n1[i] + n2[j] - 2 * (int) '0' + carry;
				carry = answer / 10;
				answer = answer % 10;
				n1[i] = (char) (answer + (int) '0');
				i--;
				j--;
			}
			while (carry != 0 && i > -1) {
				answer = n1[i] - (int) '0' + carry;
				carry = answer / 10;
				answer = answer % 10;
				n1[i] = (char) (answer + (int) '0');
				i--;
			}
			StringBuilder sb = new StringBuilder();
			if (carry != 0) {
				sb.append(String.valueOf(carry));
			}
			sb.append(n1);
			return sb.toString();
		} else {
			int i = n1.length - 1;
			int j = n2.length - 1;

			while (i > -1) {
				answer = n1[i] + n2[j] - 2 * (int) '0' + carry;
				carry = answer / 10;
				answer = answer % 10;
				n2[j] = (char) (answer + (int) '0');
				i--;
				j--;
			}
			while (carry != 0 && j > -1) {
				answer = n2[j] - (int) '0' + carry;
				carry = answer / 10;
				answer = answer % 10;
				n2[j] = (char) (answer + (int) '0');
				j--;
			}
			StringBuilder sb = new StringBuilder();
			if (carry != 0) {
				sb.append(String.valueOf(carry));
			}
			sb.append(n2);
			return sb.toString();
		}
	}

}
