/**
 * LeetCode
 * Problem 263
 * @author Siddharth
 *
 */
public class UglyNumber {

	public static void main(String[] args) {
		UglyNumber un = new UglyNumber();
		System.out.println(un.isUgly(8));
		System.out.println(un.isUgly(6));
		System.out.println(un.isUgly(14));
		System.out.println(un.isUgly(-2147483648));
		System.out.println(un.isUgly(-6));
		System.out.println(un.isUgly(1));
		System.out.println(un.isUgly(-1000));
	}

	public boolean isUgly(int num) {
		if (num == 0)
			return false;
		long n = Math.abs((long) num);

		while (n != 1) {
			double answer = (double) n / 2;
			if (answer == Math.floor(answer)) {
				n = (int) answer;
				continue;
			}

			answer = (double) n / 3;
			if (answer == Math.floor(answer)) {
				n = (int) answer;
				continue;
			}

			answer = (double) n / 5;
			if (answer == Math.floor(answer)) {
				n = (int) answer;
				continue;
			}
			return false;
		}

		if (num < 0) {
			return false;
		}
		return true;

	}
}
