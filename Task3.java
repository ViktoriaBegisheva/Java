package lab5;

class Class2{
	String s1;
	String s2="task";
	
	Class2 (String s){
		s1=s;
	}
}

class Class3{
	String s1;
	
	Class3(){
		System.out.println("3.3: Task");
	}
	
	Class3 (String s){
		System.out.println("3.4: Task: "+s);
	}
	
	//@Override
    protected void finalize() {
        System.out.println("3.11 (dz): finalize()");
    }
}
public class Task3 {
	
	public static void main(String[] args) {
		Class2 c1=new Class2("TASK");
		// 3.2
		System.out.println("3.2: "+c1.s1+" "+c1.s2);
		
		// 3.3
		Class3 c=new Class3();
		
		// 3.1
		System.out.println("3.1 "+c.s1);
		
		// 3.4
		Class3 c2=new Class3("task3-4");
		
		// 3.11 (dz)
		c2.finalize();
		
		

	}

}
