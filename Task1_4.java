package lab6;

class Task4{
	protected int a;
	protected int b;
	
	protected Task4(){
		a=5;
		b=3;
	}
}

public class Task1_4 extends Task4{

	Task1_4(){
		super();
		a+=1;
		b+=1;
	}
	public int sum() {
		return super.a + super.b;
	}
	
	public static void main(String[] args) {
		
		// 1.4
		Task1_4 t = new Task1_4();
		System.out.println("a = "+t.a+" b = "+t.b);
		//t.a=7;
		//t.b=9;
		System.out.println("a+b = "+t.sum());
	}

}
