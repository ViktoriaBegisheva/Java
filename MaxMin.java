package lab4;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// 1.2

		Scanner sc = new Scanner(System.in);
		int min_n = Integer.MAX_VALUE;
		int max_n = Integer.MIN_VALUE;
		
		while (sc.hasNext()) {
			int number = sc.nextInt();
			if (number == 0) break;
			if (number > max_n)
				max_n = number;
			if (number < min_n)
				min_n = number;
		}
		System.out.println("max: "+max_n+"; min: "+min_n);
		sc.close();
		//return x>y?x:y
	}

}
