package lab3;

class Dog{
	String name;
	String say;
	
	Dog(String name1,String say1){
		name=name1;
		say=say1;
	}
	
	void show(){
		System.out.printf("Dog %s says %s\n",name,say);
	}
}

class Num{
	float a;
	
	Num(float a1){
		a=a1;
	}
	
	float return_a(Num n) {
		System.out.println(n);
		return n.a;
	}
	
	
}
public class Task1 {

	public static void main(String[] args) {
		//1.3
		System.out.printf("\n  1.3 \n");
		String s="java\n";
		System.out.printf("%s",s);
		System.out.print(s);
		
		//1.4
		System.out.printf("\n  1.4\n");
		float a=5;
		Num n1 = new Num(a);
		System.out.println(n1);
		
		//1.5
		System.out.printf("\n  1.5\n");
		System.out.println(n1.return_a(n1));
		
		
		//1.6
		System.out.printf("\n  1.6\n");
		Dog d1 = new Dog("spot","Ruff!");
		Dog d2 = new Dog("scruffy","Wurf!");

		d1.show();
		d2.show();
		System.out.println("d1: "+d1+"\nd2: "+d2);
	}

}
