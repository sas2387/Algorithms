/**
 * Problem 419
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
		int k = 0;
		int count = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					board[i][j] = '.';
					k = j + 1;
					while (k < board[i].length && board[i][k] == 'X') {
						board[i][k] = '.';
						k++;
					}
					k = i + 1;
					while (k < board.length && board[k][j] == 'X') {
						board[k][j] = '.';
						k++;
					}
					count++;
				}
			}
		}

		return count;
	}

}
