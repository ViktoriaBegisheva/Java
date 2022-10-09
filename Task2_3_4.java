package lab3;
import java.util.Scanner;
public class Task2_3_4 {
	
	static void printChar(char c) {
		System.out.println("Char: "+c+" Binary: "+Integer.toBinaryString(c));
	}
	
	public static void main(String[] args) {
		//2.3
		char c='a';
		char c1='x';
		char c2=' ';
		char c3='A';
		printChar(c);
		printChar(c1);
		printChar(c2);
		printChar(c3);
		
		//2.4
		long n;
		byte m;
		Scanner in = new Scanner(System.in);
		
		n=in.nextLong();
		m=in.nextByte();

		long w=1<<m;
		long p=n|w;
		
		System.out.printf("n = %s  m = %d \n%s - %d\n",Long.toBinaryString(n),m,Long.toBinaryString(p),p);
		
		in.close();
		
		
	}

}
