import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Harmonik sayı dizisi için bir n değeri girin: ");
		int n = inp.nextInt();
		double sum = 0.0;
		
		for (double i = 1; i <= n; i++) {
			sum += (1/i); 
		}
		
		System.out.println("Harmonik sayı dizisinin sonucu: "+ sum);
	}	
}		
