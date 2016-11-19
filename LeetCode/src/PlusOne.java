/**
 * LeetCode Problem 66
 * @author Siddharth
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		PlusOne po = new PlusOne();
		int array[] = po.plusOne(new int[] { 9, 9, 9 });
		for (int n : array) {
			System.out.print(n);
		}
	}

	public int[] plusOne(int[] digits) {
		int carry = 1;
		int sum;
		for (int i = digits.length - 1; i > -1; i--) {
			if (carry != 0) {
				sum = digits[i] + carry;
				if (sum > 9) {
					digits[i] = sum % 10;
					carry = sum / 10;
				} else {
					digits[i] = sum;
					carry = 0;
				}
			}
		}

		if (carry != 0) {
			int newdigits[] = new int[digits.length + 1];
			newdigits[0] = carry;
			for (int i = 0; i < digits.length; i++) {
				newdigits[i + 1] = digits[i];
			}
			return newdigits;
		} else {
			return digits;
		}

	}

}
