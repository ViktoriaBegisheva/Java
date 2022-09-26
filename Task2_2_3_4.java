package Lab1_2;
import java.util.Scanner;
import java.lang.Math;

public class Task2_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		System.out.print("2.2: Input: ");
		int n = in.nextInt();
		int m = in.nextInt();
		String n_s = Integer.toString(n);
		String m_s = Integer.toString(m);
		
		System.out.printf("%d %d\n", n_s.length(),m_s.length());
		System.out.printf("%d %d\n",(int) Math.log10(n)+1, (int) Math.log10(m)+1);
		System.out.printf("%.2f\n", 2/(1/ (float) n+1/(float) m));
		
		System.out.print("2.3: Input: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		System.out.printf("%.2f  %e\n",Math.sqrt(a*b),Math.sqrt(a*b));
		
		System.out.print("2.4: Input : ");
		double c = in.nextDouble();
		System.out.printf("F = " + Double.toString(9*c/5+32));
		
		in.close();

	}

}
