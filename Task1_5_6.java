/**
 * 
 */
package Lab1_2;

/**
 * @author User
 *
 */
public class Task1_5_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length<4) {
			System.out.println("Not");
		}
		
		double a1 = Double.parseDouble(args[0]);
		double a2 = Double.parseDouble(args[1]);
		double a3 = Double.parseDouble(args[2]);
		String user = args[3];
		
		double sum_a = a1+a2+a3;
		System.out.printf("1.5: %.4f %.4f %.4f\n", a1,a2,a3);
		System.out.printf("1.6: Sum = %.4f\n", sum_a);
		System.out.printf("1.7: User = %s\n", user);

	}

}
