/**
 * LeetCode
 * Problem 171
 * @author Siddharth
 *
 */
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
		System.out.println(escn.titleToNumber("AA"));
		System.out.println(escn.titleToNumber("AZ"));
		System.out.println(escn.titleToNumber("NM"));
		System.out.println(escn.titleToNumber("AAZ"));
		System.out.println(escn.titleToNumber("ABCD"));
	}
	
	public int titleToNumber(String s) {
		char letter[] = s.toCharArray();
		int columnNumber = 0;
		int index =letter.length;
		
		for(int i = 0; i < letter.length; i++){
			columnNumber += ((int)letter[i] - (int)'A' + 1) * (int)Math.pow(26, index - 1);
			index--;
		}
		return columnNumber;
    }
	
}
