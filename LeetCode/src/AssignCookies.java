import java.util.Arrays;
/**
 * LeetCode
 * Problem 455
 * @author Siddharth Shah
 *
 */
public class AssignCookies {

	public static void main(String[] args) {
		AssignCookies ac = new AssignCookies();
		System.out.println(ac.findContentChildren(new int[] { 1, 2 }, new int[] { 1, 2, 3 }));

	}

	public int findContentChildren(int[] g, int[] s) {
		int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0, j = 0;
		while (i < g.length && j < s.length) {
			if (g[i] <= s[j]) {
				i++;
				count++;
			}
			j++;
		}
		return count;
	}

}
