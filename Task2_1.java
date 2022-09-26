package Lab1_2;
import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Input surnsme: ");
		String s = in.nextLine();
		
		System.out.printf("Hello %s!", s);
		in.close();
		 
	}

}
