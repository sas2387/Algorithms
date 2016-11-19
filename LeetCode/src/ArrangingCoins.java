/**
 * LeetCode
 * Problem 441
 * @author Siddharth
 *
 */
public class ArrangingCoins {

	public static void main(String[] args) {
		ArrangingCoins ac = new ArrangingCoins();
		System.out.println(ac.arrangeCoins(1));
	}

	public int arrangeCoins(int n) {
		return (int) (Math.sqrt(1 + 8 * n) - 1) / 2;
	}
}
