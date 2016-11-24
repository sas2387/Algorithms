/**
 * LeetCode
 * Problem 88
 * @author Siddharth
 *
 */
public class MergeSortedArrays {

	public static void main(String[] args) {

		int array1[] = new int[] { 1, 5, 8, 10, 15, 20, 0, 0, 0, 0, 0 };
		int array2[] = new int[] { 2, 8, 10, 18, 19 };
		MergeSortedArrays msa = new MergeSortedArrays();
		msa.merge(array1, 6, array2, array2.length);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1, j = n - 1;
		int k = m + n - 1;

		while (i > -1 && j > -1) {
			if (nums1[i] >= nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}

		while (j > -1) {
			nums1[k] = nums2[j];
			k--;
			j--;
		}

	}

}
