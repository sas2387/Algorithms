/**
 * Given (x,y) co-ordinates as the starting point of the spiral and number of
 * segments in a spiral, print the co-ordinates of the spiral endpoints. Eg:
 * Spiral starting with (0,0) and 5 segments (1,0) (1,1) (-1,1) (-1,-1) (2,-1)
 * 
 * @author Siddharth
 *
 */
public class SpiralEndpoints {

	public static void main(String[] args) {
		SpiralEndpoints spiral = new SpiralEndpoints();
		spiral.printEndpoints(0, 0, 5);
	}

	class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public enum Direction {
		LEFT, UP, RIGHT, DOWN
	}

	private void printEndpoints(int x, int y, int segments) {
		// initial length of the first segment would always be 1
		int segmentsSeenSoFar = 0;
		int initialLength = 1;
		Point p = new Point(x, y);
		printEndPointsOfSpiral(p, segments, initialLength, segmentsSeenSoFar);
	}

	private void printEndPointsOfSpiral(Point p, int totalSegments, int length,
			int segmentsSeen) {
		if (segmentsSeen < totalSegments) {
			moveAndPrint(p, length, Direction.LEFT);
			segmentsSeen++;
		} else {
			return;
		}
		if (segmentsSeen < totalSegments) {
			moveAndPrint(p, length, Direction.UP);
			segmentsSeen++;
		} else {
			return;
		}
		// increase length of segment after every 2 segments are seen
		length++;
		if (segmentsSeen < totalSegments) {
			moveAndPrint(p, length, Direction.RIGHT);
			segmentsSeen++;
		} else {
			return;
		}
		if (segmentsSeen < totalSegments) {
			moveAndPrint(p, length, Direction.DOWN);
			segmentsSeen++;
		} else {
			return;
		}
		// increase length of segment after every 2 segments are seen
		length++;
		// recursively print all the endpoints of the spiral
		printEndPointsOfSpiral(p, totalSegments, length, segmentsSeen);
	}

	public void moveAndPrint(Point p, int length, Direction direction) {
		switch (direction) {
		case LEFT:
			p.x = p.x + length;
			break;
		case UP:
			p.y = p.y + length;
			break;
		case RIGHT:
			p.x = p.x - length;
			break;
		case DOWN:
			p.y = p.y - length;
			break;
		}
		System.out.println("(" + p.x + "," + p.y + ")");
	}

}
