/**
 * LeetCode Problem 26
 * 
 * @author Siddharth Shah
 *
 */
public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		if (nums.length > 0) {
			int currentPos = 0;
			int currentVal = nums[currentPos];
			int unique = 1;
			int i = 1;
			while (i < nums.length) {
				if (nums[i] == currentVal) {
					i++;
				} else {
					nums[++currentPos] = nums[i];
					currentVal = nums[i];
				}
			}
			return currentPos + 1;
		} else {
			return 0;
		}
	}

}
