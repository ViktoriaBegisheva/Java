package lab12;

import java.util.Stack;

public class task1_2 {

	public static void main(String[] args) {
		// 1.2
		// reveres number
		
		Stack<String> stack = new Stack<String>();
		int num = 1234567890;
		while(num>1) {
			int a0 = num%10;
			stack.push(Integer.toString(a0));
			num/=10;
		}
		String number = "";
		for(String n:stack)
			number+=n;
		System.out.println(Integer.parseInt(number));

	}

}
