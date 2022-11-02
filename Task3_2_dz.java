package lab6;

public class Task3_2_dz {

	public static void main(String[] args) {
		// 3.2 (dz)
		
		Complex a = new Complex(1,1);
		Complex b = new Complex(2,4);
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		System.out.println("a+b = " + a.sum(b).toString());
		System.out.println("a*b = " + a.mul(b).toString());
		
		int n=4;
		Complex c = new Complex();
		Complex[] arr = new Complex[n];
		arr[0] = new Complex(1,1);
		arr[1] = new Complex(1,1);
		arr[2] = new Complex(1,1);
		arr[3] = new Complex(1,1);

		System.out.println("\narr sum = " + c.sumArr(arr).toString());
		System.out.println("arr mul = " + c.mulArr(arr).toString());

	}

}
