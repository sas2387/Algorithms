import java.util.Arrays;
/**
 * LeetCode
 * Problem 169
 * @author Siddharth
 *
 */
public class MajorityElement {

	public int majorityElement(int[] nums) {
		// Apply Quicksort
		Arrays.sort(nums);
		// As the number of elements for the majority element
		// is greater than floor(n/2) so the middle element has to be
		// the majority element
		return nums[(nums.length - 1) / 2];
	}

}
