package lab3;
import java.util.Random;

public class Task3_1_2_5 {
	
	static int randNum(Random rnd) {
		int n = rnd.nextInt(101);
		return n;
	}
	
	public static void main(String[] args) {
		//3.1
		System.out.printf("\n3.1\n");
		for (int i=1;i<=100;i++)
			System.out.printf("%d ",i);
		
		//3.2
		System.out.printf("\n3.2\n");
		Random rnd = new Random();
		int a=randNum(rnd),b;
		for (int i=0;i<25-1;i++) {
			b=randNum(rnd);
			System.out.printf("max [%d , %d] -- ",a,b);
			if (a>=b)
				System.out.printf("%d\n",a);
			else {
				System.out.printf("%d\n",b);
				a=b;
			}
		}
		
		
		//3.5 (dz)
		System.out.printf("3.5 (dz)\n");

		int a0,a1;
		
		for (int i=0;i<args.length;i++) {
			a0 = Integer.parseInt(args[i]);
			int mi=0,ma=0;
			for (int j=0;j<args.length;j++) {
				a1 = Integer.parseInt(args[j]);
				if (a1>a0)
					ma+=1;
				if (a1<a0)
					mi+=1;
			}
			if (ma==mi) {
				System.out.printf("median: %d\n",a0);
			}
			
		}
	}

}
