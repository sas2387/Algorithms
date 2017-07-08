/**
 * LeetCode
 * Problem 35
 * @author Siddharth Shah
 *
 */
public class SearchPosition {
	
	public static void main(String[] args) {
		
	}

	public int searchInsert(int[] nums, int target) {
		if(target <= nums[0]){
			return 0;
		} else if (target > nums[nums.length-1]){
			return nums.length;
		} else if (target == nums[nums.length-1]){
			return nums.length-1;
		} else {
			int i = 0;
			int j = nums.length-1;
			while(j - i > 1) {
				int index = (i + j) / 2 ;
				if(target == nums[index]){
					return index;
				} else if (target > nums[index]){
					i = index;
				} else {
					j = index;
				}
			}
			return i+1;
		}
    }
}
