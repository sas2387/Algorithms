import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * LeetCode
 * Problem 349
 * @author Siddharth
 *
 */
public class ArrayIntersetion {

	public static void main(String[] args) {
		ArrayIntersetion inter = new ArrayIntersetion();
		int answer[] = inter.intersection(new int[] { 1, 2 }, new int[] { 2, 1 });
		for (int a : answer) {
			System.out.print(a + ",");
		}

	}

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] > nums2[j])
				j++;
			else
				i++;
		}

		int ans[] = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		int k = 0;
		while (it.hasNext()) {
			ans[k] = it.next();
			k++;
		}

		return ans;
	}
}
