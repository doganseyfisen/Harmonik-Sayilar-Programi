/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {
		double numArr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		double sum = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			sum += (1/numArr[i]);
		}
		
		System.out.print("Harmonik sayı dizisi sonucu= " + sum);
	}
}
