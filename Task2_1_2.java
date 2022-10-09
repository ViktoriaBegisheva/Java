package lab3;

public class Task2_1_2 {

	public static void main(String[] args) {
		// 2.1
		System.out.printf("2.1\n");

		final int a = 0x12345;
		int b = 0x11111;

		System.out.printf("a&b: %d  a|b: %d  a^b: %d\n",a&b,a|b,a^b);
		System.out.printf("a&b: %o  a|b: %o  a^b: %o\n",a&b,a|b,a^b);
		System.out.printf("a&b: %x  a|b: %x  a^b: %x\n",a&b,a|b,a^b);
		
		System.out.printf("Binary %s\n",Integer.toBinaryString(a&b));
		
		// 2.2
		System.out.printf("2.2\n");
		int n=137;
		System.out.println(n+" "+Integer.toBinaryString(n));
		int len=Integer.toBinaryString(n).length();
		for (int i=0;i<len;i++) {
			n=n>>1;
			System.out.println(n+" "+Integer.toBinaryString(n));
		}
		
		

	}

}
