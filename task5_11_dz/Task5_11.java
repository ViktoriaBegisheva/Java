package task5_11_dz;

public class Task5_11 {

	public static void main(String[] args) {
		// 5.11
		
		Bird b = new Bird(3,4,"bird");
		b.fly();
		b.sing();
		Sitter s = new Sitter(b);
		s.fly();
		s.sing();
		s.setNumEggs(10);
		s.layEggs();
		s.setTimeHatch(100);
		s.hatchChicks();

	}

}
