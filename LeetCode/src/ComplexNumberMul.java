/**
 * LeetCode Problem 537
 * @author siddharth
 *
 */
public class ComplexNumberMul {
	
	public String complexNumberMultiply(String a, String b) {
		String aParts[] = a.split("\\+");
		int aReal = Integer.parseInt(aParts[0]);
		int aImg = Integer.parseInt(aParts[1].substring(0, aParts[1].length() - 1));
		String bParts[] = b.split("\\+");
		int bReal = Integer.parseInt(bParts[0]);
		int bImg = Integer.parseInt(bParts[1].substring(0, bParts[1].length() - 1));
		
		int ansReal = (aReal * bReal) - (aImg * bImg);
		int ansImg = (aReal * bImg) + (aImg * bReal);
		
		return ansReal+"+"+ansImg+"i";   
    }

}
