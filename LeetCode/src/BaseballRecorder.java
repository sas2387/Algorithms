import java.util.ArrayList;
/**
 * LeetCode Problem 682
 * @author siddharth
 *
 */
public class BaseballRecorder {
	public int calPoints(String[] ops) {
		int answer = 0;
		ArrayList<Integer> scores = new ArrayList<>();

		for (String score : ops) {
			switch (score) {
			case "C":
				scores.remove(scores.size() - 1);
				break;
			case "D":
				int currentScore = scores.get(scores.size() - 1);
				scores.add(currentScore * 2);
				break;
			case "+":
				int currentScore1 = scores.get(scores.size() - 1);
				int currentScore2 = scores.get(scores.size() - 2);
				scores.add(currentScore1 + currentScore2);
				break;
			default:
				currentScore = Integer.parseInt(score);
				scores.add(currentScore);
				break;
			}
		}

		for (int s : scores) {
			answer += s;
		}

		return answer;
	}

}
