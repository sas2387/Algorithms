/**
 * LeetCode
 * Problem 231
 * @author siddharthshah
 *
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		PowerOfTwo pot = new PowerOfTwo();
		System.out.println(pot.isPowerOfTwo(1));
	}

	public boolean isPowerOfTwo(int n) {
		if (n < 0)
			return false;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				count++;
			}
			if (count > 1)
				break;
		}
		return count == 1;
	}

}
