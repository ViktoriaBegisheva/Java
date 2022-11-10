package task4_1;

public class Task4_1 {

	public static Polynomial sumPolys(Polynomial[] arr) {
		Polynomial c = arr[0];
		for (int i=1;i<arr.length;i++) {
			c.sumPoly(arr[i]);
		}
		return c;
	}
	
	public static void main(String[] args) {
		// 4.1
		int n = 3;
		Polynomial[] poly = new Polynomial[n];
		poly[0] = new Polynomial("1/2 1/3 4/9 2/3");
		poly[1] = new Polynomial("1/2 1/3 5/9 2/3");
		poly[2] = new Polynomial("5 1/3 -3/9 2/3");		
		System.out.println(sumPolys(poly).toString());
	}

}
