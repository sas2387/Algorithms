/**
 * LeetCode
 * Problem 414
 * @author Siddharth
 *
 */
public class ThirdMaximum {

	public static void main(String[] args) {
		ThirdMaximum tm = new ThirdMaximum();
		System.out.println(tm.thirdMax(new int[] { 1, 2 }));
		System.out.println(tm.thirdMax(new int[] { 1, 2, 2, 5, 3, 5 }));
		System.out.println(tm.thirdMax(new int[] { 2, 2, 3, 1 }));
	}

	public int thirdMax(int[] nums) {
		int max1 = -1, max2 = -1, max3 = -1;
		boolean firstset = false, secondset = false, thirdset = false;

		for (int i = 0; i < nums.length; i++) {
			if (!firstset) {
				max1 = nums[i];
				firstset = true;
			} else if (nums[i] > max1) {
				if (!secondset)
					secondset = true;
				else if (!thirdset)
					thirdset = true;
				max3 = max2;
				max2 = max1;
				max1 = nums[i];
			} else if (!secondset) {
				if (nums[i] != max1) {
					max2 = nums[i];
					secondset = true;
				}
			} else if (nums[i] > max2) {
				if (nums[i] == max1)
					continue;
				if (!thirdset)
					thirdset = true;
				max3 = max2;
				max2 = nums[i];
			} else if (!thirdset) {
				if (nums[i] != max2 && nums[i] != max1) {
					max3 = nums[i];
					thirdset = true;
				}
			} else if (nums[i] > max3) {
				if (nums[i] == max2)
					continue;
				max3 = nums[i];
			}
		}

		if (max3 != -1)
			return max3;
		else
			return max1;
	}

}
