import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * Problem 118
 * @author Siddharth
 *
 */
public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		System.out.println(pt.generate(5));
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> numbers = new ArrayList<>();
		List<Integer> prevList = null;
		int row = 1;
		while (row <= numRows) {
			List<Integer> rowNumbers = new ArrayList<>();
			if (row == 1) {
				rowNumbers.add(1);
				prevList = rowNumbers;
				numbers.add(rowNumbers);
			} else {
				rowNumbers.add(1);
				int currIndex = 1;
				int newNumber;
				while (currIndex < prevList.size()) {
					newNumber = prevList.get(currIndex - 1) + prevList.get(currIndex);
					rowNumbers.add(newNumber);
					currIndex++;
				}
				rowNumbers.add(1);
				prevList = rowNumbers;
				numbers.add(rowNumbers);
			}
			row++;
		}
		return numbers;
	}
}
