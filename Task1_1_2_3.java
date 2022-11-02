package lab6;
import other.Task1_1_other;
import other.Task1_2_other;
import other.Task1_3_other;

public class Task1_1_2_3 {

	protected static void task2() {
		Task1_2_other t = new Task1_2_other();
		System.out.println("name: "+t.getName());
	}
	
	public static void main(String[] args) {
		//1.1
		System.out.println("\n1.1");
		Task1_1_other t = new Task1_1_other();
		
		// 1.2
		System.out.println("\n1.2");
		task2();
		
		// 1.3
		System.out.println("\n1.3");
		Task1_3_other t3 = new Task1_3_other();
		System.out.println("public field a = "+t3.a+";\nprotected field b is not visible;"
				+ "\nprivate field c is not visible");
		
	}

}
