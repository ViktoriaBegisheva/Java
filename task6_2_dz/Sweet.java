package task6_2_dz;

public class Sweet {
	String name;
	double weight;
	double sugar;
	String flavor;
	
	public Sweet(){}
	
	Sweet(String name, double weight, double sugar,String flavor){
		this.name = name;
		this.weight = weight;
		this.sugar = sugar;
		this.flavor=flavor;
	}
	
	double getWeight() {
		return weight;
	}

	double getSugar() {
		return sugar;
	}
	
	@Override
	public String toString() {
		return name+" : (flavor: "+flavor+", weight: " +weight+" g, sugar: "+sugar+" g)";
	}
}
