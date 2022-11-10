package task5_11_dz;

public class Sitter {
	int numEggs;
	int timeHatchChicks;
	Bird bird;
	
	Sitter(Bird b){
		bird = b;
		numEggs=0;
		timeHatchChicks=0;
		System.out.println("Bird "+bird.toString()+" becomes Sitter!");
		bird.name+="_sitter";
	}
	Sitter(Bird b,int num,int timeH){
		bird = b;
		numEggs=num;
		timeHatchChicks=timeH;
		System.out.println("Bird "+bird.toString()+" becomes Sitter!");
		bird.name+="_sitter";
	}
	
	void setNumEggs(int numberEggs) {
		numEggs=numberEggs;
	}
	void setTimeHatch(int time) {
		timeHatchChicks=time;
	}
	
	String layEggs() {
		String s="Bird "+bird.toString()+
				" must lays "+
				numEggs+" eggs!";
		System.out.println(s);
		return s;
	}
	String hatchChicks() {
		String s="Bird "+bird.toString()+
				" must hatches "+
				numEggs+" Chicks for "+timeHatchChicks+" days!";
		System.out.println(s);
		return s;
	}

	void fly() {
		bird.fly();
	}
	
	void sing() {
		bird.sing();
	}
	
	@Override
	public String toString() {
		return layEggs()+" "+hatchChicks();
	}

}
