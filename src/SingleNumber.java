import java.util.Arrays;

/**
 * LeetCode 
 * Problem 136
 * @author Siddharth
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber singleNumber = new SingleNumber();
		System.out.println(singleNumber.singleNumber(
				new int[] { 17, 12, 5, -6, 12, 4, 17, -5, 2, -3, 2, 4, 5, 16,
						-3, -4, 15, 15, -4, -5, -6 }));
	}

	public int singleNumber(int[] nums) {
		// If only number in array return it
		if (nums.length == 1) {
			return nums[0];
		}

		// Implement Quicksort for inplace sorting
		// No extra memory required
		// Arrays.sort() uses dual sort - either quicksort or mergesort
		// Refer http://tinyurl.com/znr5ve5
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}
}
