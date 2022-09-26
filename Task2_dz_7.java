/**
 * 
 */
package Lab1_2;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class Task2_dz_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.print("2.7: Input nums and 0 at the end: ");
		
		int value = 1; //
		int prod = 1;
		while (value!=0) {
			prod *= value;
			value = in.nextInt();
			if (value==0) break;
		}
		System.out.printf("%d\n", prod);
		
		in.close();

	}

}
