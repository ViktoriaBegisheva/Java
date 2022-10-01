package lab3_4;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		//**
		
		//3.1
		System.out.printf("3.1");
		System.out.printf("1.2+31 = %.1f\n", 1.2+31);
		System.out.printf("45*54-11 = %d\n", 45*54-11);
		System.out.printf("15/4 = %.2f\n",(float) 15/4);
		System.out.printf("15.0/4 = %.2f\n", 15.0/4);
		System.out.printf("67 mod(5) = %d\n", 67%5);
		System.out.printf("(2*45.1 +3.2)/2 = %.2f\n", (2*45.1 +3.2)/2);
		

		//3.2
		System.out.printf("3.2");
		System.out.printf("Результат дорівнює: %d\n", 2+3);
		System.out.printf("Результат дорівнює: %.2f\n",4.5*56);
		System.out.printf("Результат дорівнює: %.2f\n", 2/3.0);
		
		
		//3.3
		Scanner in = new Scanner (System.in);
		System.out.print("3.3 Введіть ім'я: ");
		String s = in.nextLine();
		System.out.printf("Привіт %s!\n", s);
		
		
		//3.4
		System.out.printf("3.4 %f %f %f %f %f %f\n",Math.pow(10,-44),2.33E5,Math.PI,Math.E,Math.sqrt(5),Math.log(100));
		//**/

		
		//3.5
		System.out.printf("3.5");
		int a=1, b=2, c=3, d=4, e=5;
		double a0=1.0, b0=2.0, c0=3.0, d0=4.0, e0=5.0;
		System.out.printf("x |  %d  |  %d  |  %d  |  %d  |  %d  |\n", a,b,c,d,e);
		System.out.printf("- | - - | - - | - - | - - | - - |\n");
		System.out.printf("y | %.1f | %.1f | %.1f | %.1f | %.1f |\n", a0,b0,c0,d0,e0);
		
		
		//3.6
		System.out.printf("3.6 ");
		String s1="Hello";
		String s2="World";
		System.out.println("!!!"+s1+", "+s2+"!!!");
		
		
		//3.7
		double m1_37 = 40;
		double m2_37 = 50;
		double y = 6.673*Math.pow(10,-11);
		double r = 20;
		System.out.printf("3.7 F = %e\n",y*m1_37*m2_37/Math.pow(r,2));
		
		
		//3.8
		System.out.printf("3.8 Input: ");
		double num = in.nextDouble();
		System.out.printf(" = %d + %.2f\n", (int) num, num%1);
		System.out.printf("round: %d  down: %d  up: %d\n", Math.round(num), (int) Math.ceil(num-1),(int) Math.floor(num+1));
		
		
		//3.10 dz
		System.out.print("3.10 (dz) Input : ");
		double a_310 = in.nextDouble();
		double b_310 = in.nextDouble();
		System.out.printf("%.2f  %.2f\n",(a_310+b_310)/2, 2/(1/ (float) a_310+1/(float) b_310));
		System.out.printf("%e  %e\n",(a_310+b_310)/2, 2/(1/ (float) a_310+1/(float) b_310));
		in.close();
		
	}

}
