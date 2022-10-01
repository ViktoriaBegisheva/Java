package lab3_4;

import java.util.Scanner;

public class Task4 {
	
    public static double perimeter(double a, double b, double c) {
		double p=a+b+c;
		return p;
	}
	
	public static double square(double a, double b, double c) {
		double p=perimeter(a,b,c)/2;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	
	public static double segment_len(double a_x, double a_y, double b_x, double b_y) {
		double l = Math.sqrt(Math.pow(a_x-b_x,2) + Math.pow(a_y-b_y,2));
		return l;
	}

	public static void main(String[] args) {
		
		// 4.4
		double a=3,b=3.6+3*Math.pow(2,-111),c=3.6+3*Math.pow(2,-111);
		System.out.printf("4.4 \nperimeter = %f\n",perimeter(a,b,c));
		System.out.printf("square = %f\n",square(a,b,c));
		
		//4.5 dz
		/**
		 * 0 0
		 * 1 0
		 * 1 1
		 * square = 0,5
		 */
		Scanner in = new Scanner (System.in);
		System.out.printf("4.5 (dz) \nInput coordinat A(x,y): ");
		double a_x = in.nextDouble();
		double a_y = in.nextDouble();
		System.out.printf("\nInput coordinat B(x,y): ");
		double b_x = in.nextDouble();
		double b_y = in.nextDouble();
		System.out.printf("\nInput coordinat C(x,y): ");
		double c_x = in.nextDouble();
		double c_y = in.nextDouble();
		double a_b = segment_len(a_x, a_y, b_x, b_y);
		double c_b = segment_len(c_x, c_y, b_x, b_y);
		double a_c = segment_len(a_x, a_y, c_x, c_y);
		System.out.printf("square = %.2f\n", square(a_b,c_b,a_c));
		in.close();

	}

}
