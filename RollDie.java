package lab3;

import java.util.Random;

public class RollDie {
	
	static int randNum(Random rnd) {
		int n = rnd.nextInt(1,7);
		return n;
	}
	
	public static void main(String[] args) {
		//3.3
		int n=10;
		
		Random rnd = new Random();
		int a=randNum(rnd),b;
		int s=a;
		System.out.printf("%d ",a);
		for (int i=0;i<n-1;i++) {
			b=randNum(rnd);
			System.out.printf("%d ",b);
			if (a<=b) a=b;
			s+=b;
		}
		System.out.printf("\nsum (%d) = %d",n,s);
		System.out.printf("\nmax value = %d",a);
	}

}
