/**
 * LeetCode Problem 223
 * @author Siddharth
 *
 */
public class RectangleArea {

	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int x1, x2;
		int y1, y2;

		x1 = A > E ? A : E;
		x2 = C < G ? C : G;
		y1 = B > F ? B : F;
		y2 = D < H ? D : H;

		int area = (C - A) * (D - B) + (G - E) * (H - F);
		if (x1 < x2 && y1 < y2) {
			area -= (x2 - x1) * (y2 - y1);
		}

		return area;
	}

}
