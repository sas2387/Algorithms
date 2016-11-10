import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * Problem 412
 * @author Siddharth
 *
 */
public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println(fizzBuzz.fizzBuzz(1));
	}

	public List<String> fizzBuzz(int n) {
		ArrayList<String> stringList = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				stringList.add("FizzBuzz");
			} else if (i % 5 == 0) {
				stringList.add("Buzz");
			} else if (i % 3 == 0) {
				stringList.add("Fizz");
			} else {
				stringList.add(String.valueOf(i));
			}
		}
		return stringList;
	}

}
