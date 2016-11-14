import java.util.HashSet;
import java.util.Set;
/**
 * LeetCode
 * Problem 217
 * @author Siddharth
 *
 */
public class ContainsDuplicates {

	public static void main(String[] args) {
		ContainsDuplicates cd = new ContainsDuplicates();
		System.out.println(cd.containsDuplicate(new int[] { 4, 7, 8, 4 }));
	}

	public boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			boolean result = set.add(nums[i]);
			if (!result) {
				return !result;
			}
		}

		return false;
	}

}
