/**
 * LeetCode
 * Problem 283
 * @author Siddharth
 *
 */
public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes mz = new MoveZeroes();
		int array[] = new int[] { 1, 4, 0, 6, 0, 8, 9, 0 };
		mz.moveZeroes(array);
		for (int n : array)
			System.out.print(n + " ");
	}

	public void moveZeroes(int[] nums) {
		int zeroseen = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				zeroseen++;
			else if (zeroseen != 0) {
				nums[i - zeroseen] = nums[i];
				nums[i] = 0;
			}
		}
	}

}
