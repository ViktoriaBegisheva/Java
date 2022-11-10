package task5_11_dz;

public class Bird extends Cuckoo{
	String name;
	
	Bird(int flyTime,int volumeSing,String name){
		super(flyTime,volumeSing);
		this.name=name;
	}
	@Override
	public String toString() {
		return name+" ("+super.toString()+")";
	}
}
