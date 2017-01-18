/**
 * LeetCode Problem 463
 * @author Siddharth Shah
 *
 */
public class IslandPerimeter {

	public static void main(String[] args) {
		// int island[][] = { { 0, 1, 0, 0 }, { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, {
		// 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int island[][] = { { 1 }, { 0 } };
		IslandPerimeter islandPerimeter = new IslandPerimeter();
		islandPerimeter.islandPerimeter(island);
	}

	public int islandPerimeter(int[][] grid) {
		int totalPerimeter = 0;
		int rowsNum = grid.length;
		int colsNum = grid[0].length;
		int perimeter[][] = new int[rowsNum][colsNum];
		for (int i = 0; i < rowsNum; i++) {
			for (int j = 0; j < colsNum; j++) {
				perimeter[i][j] = 4;
			}
		}

		for (int i = 0; i < rowsNum; i++) {
			for (int j = 0; j < colsNum; j++) {
				if (grid[i][j] == 1) {
					if (i > 0) {
						perimeter[i - 1][j]--;
					}
					if (j > 0) {
						perimeter[i][j - 1]--;
					}
					if (i < rowsNum - 1) {
						perimeter[i + 1][j]--;
					}
					if (j < colsNum - 1) {
						perimeter[i][j + 1]--;
					}
				}
			}
		}

		for (int i = 0; i < rowsNum; i++) {
			for (int j = 0; j < colsNum; j++) {
				if (grid[i][j] == 1) {
					totalPerimeter += perimeter[i][j];
				}
			}
		}

		return totalPerimeter;
	}
}
