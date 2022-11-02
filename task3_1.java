package lab6;

public class task3_1 {

	public static void main(String[] args) {
		// 3.1
		
		Rational a = new Rational(1,5);
		Rational b = new Rational(4,7);
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		System.out.println("a+b = " + a.sum(b).toString());
		System.out.println("a-b = " + a.sub(b).toString());
		System.out.println("a*b = " + a.mul(b).toString());
		System.out.println("a/b = " + a.div(b).toString());

		
		int n=3;
		Rational[] arr =new Rational[n];
		arr[0] = new Rational(1,10);
		arr[1] = new Rational(4,10);
		arr[2] = new Rational(7,10);
		
		Rational c = new Rational();
		arr = c.task(arr);
		System.out.println("\narr: ");
		for (Rational r:arr)
			System.out.printf("%s ",r.toString());

	}

}
