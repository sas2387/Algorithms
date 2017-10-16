/**
 * 
 * LeetCode Problem 419
 * 
 * @author Siddharth
 *
 */
public class BattleShip {

	public static void main(String[] args) {
		BattleShip b = new BattleShip();
		char board[][] = new char[][] { { 'X', '.', '.', 'X' }, { '.', '.', '.', 'X' }, { '.', '.', '.', 'X' } };
		System.out.println(b.countBattleships(board));
	}

	public int countBattleships(char[][] board) {
		int count = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					if (i > 0) {
						if (board[i - 1][j] == 'X') {
							continue;
						}
					}
					if (j > 0) {
						if (board[i][j - 1] == 'X') {
							continue;
						}
					}
					count++;
				}
			}
		}

		return count;
	}

}
