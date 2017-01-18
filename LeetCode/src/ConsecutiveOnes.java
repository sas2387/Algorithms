/**
 * LeetCode Problem 485
 * @author Siddharth Shah
 *
 */
public class ConsecutiveOnes {

	public static void main(String[] args) {
		ConsecutiveOnes co = new ConsecutiveOnes();
		int ans = co.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1});
		System.out.println(ans);
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int sum = 0;
		boolean middle = false;

		for (int n : nums) {
			if (n == 1) {
				middle = true;
				sum++;
			} else {
				if (middle) {
					middle = false;
					System.out.println(sum);
					if (sum > max) {
						max = sum;
					}
					sum = 0;
				}
			}
		}
		return (max > sum) ? max : sum;
	}
}
