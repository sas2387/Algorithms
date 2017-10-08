import java.util.ArrayList;
import java.util.HashMap;

/**
 * LeetCode 500
 * 
 * @author siddharth
 *
 */
public class Keyboard {

	public static void main(String[] args) {
		String words[] = new String[] { "Hello", "Alaska", "Dad", "Peace" };
		Keyboard keyboardObj = new Keyboard();
		for (String s : keyboardObj.findWords(words)) {
			System.out.println(s);
		}
	}

	static HashMap<Character, Integer> hashMap = null;

	public String[] findWords(String[] words) {
		if (hashMap == null) {
			buildHashMap();
		}

		ArrayList<String> acceptedWordsList = new ArrayList<>();

		for (String word : words) {
			boolean accepted = true;
			String lowerCaseWord = word.toLowerCase();
			int wordRow = 0;
			for (char letter : lowerCaseWord.toCharArray()) {
				int currentLetterRow = hashMap.get(letter);
				if (currentLetterRow == wordRow) {
					continue;
				} else if (wordRow == 0) {
					wordRow = currentLetterRow;
					continue;
				} else {
					accepted = false;
					break;
				}
			}
			if (accepted) {
				acceptedWordsList.add(word);
			}
		}

		return acceptedWordsList.toArray(new String[acceptedWordsList.size()]);
	}

	public static void buildHashMap() {
		hashMap = new HashMap<>();
		hashMap.put('q', 1);
		hashMap.put('w', 1);
		hashMap.put('e', 1);
		hashMap.put('r', 1);
		hashMap.put('t', 1);
		hashMap.put('y', 1);
		hashMap.put('u', 1);
		hashMap.put('i', 1);
		hashMap.put('o', 1);
		hashMap.put('p', 1);
		hashMap.put('a', 2);
		hashMap.put('s', 2);
		hashMap.put('d', 2);
		hashMap.put('f', 2);
		hashMap.put('g', 2);
		hashMap.put('h', 2);
		hashMap.put('j', 2);
		hashMap.put('k', 2);
		hashMap.put('l', 2);
		hashMap.put('z', 3);
		hashMap.put('x', 3);
		hashMap.put('c', 3);
		hashMap.put('v', 3);
		hashMap.put('b', 3);
		hashMap.put('n', 3);
		hashMap.put('m', 3);
	}

}
