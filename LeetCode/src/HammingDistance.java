/**
 * LeetCode
 * Problem 461
 * @author Siddharth Shah
 *
 */
public class HammingDistance {

	public static void main(String[] args) {
		HammingDistance hm = new HammingDistance();
		System.out.println(hm.hammingDistance(3, 1));
	}

	public int hammingDistance(int x, int y) {
		char xc[] = Integer.toBinaryString(x).toCharArray();
		char yc[] = Integer.toBinaryString(y).toCharArray();

		int i = xc.length - 1;
		int j = yc.length - 1;
		int distance = 0;

		while (i > -1 || j > -1) {

			if (i > -1 && j > -1) {
				if (xc[i] != yc[j])
					distance++;
				i--;
				j--;
			} else {
				if (i < 0) {
					if (yc[j] != '0')
						distance++;
					j--;
				} else {
					if (xc[i] != '0')
						distance++;
					i--;
				}
			}
		}

		return distance;
	}

}
