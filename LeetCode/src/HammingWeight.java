/**
 * LeetCode
 * Problem 191
 * @author Siddharth
 *
 */
public class HammingWeight {

	public static void main(String[] args) {
		HammingWeight hm = new HammingWeight();
		System.out.println(hm.hammingWeight(11));
	}

	public int hammingWeight(int n) {
		int weight = 0;
		for (int i = 1; i < 33; i++) {
			if (checkBit(n, i))
				weight++;
		}
		return weight;
	}

	boolean checkBit(int n, int digits) {
		return (n & (1 << digits)) != 0;
	}

}
