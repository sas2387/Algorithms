import java.util.HashSet;

/**
 * LeetCode
 * Problem 202
 * @author Siddharth
 *
 */
public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappy(19));
	}

	public boolean isHappy(int n) {
		long i = 0;
		int digit = 0;
		long num = n;
		HashSet<Long> hs = new HashSet<Long>();
		while (num != 1 && hs.add(num)) {
			i = 0;
			while (num > 0) {
				digit = (int) (num % 10);
				i += digit * digit;
				num /= 10;
			}
			num = i;
		}
		if (num == 1)
			return true;
		return false;
	}

}
