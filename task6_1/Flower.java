package task6_1;

public class Flower {
	String name;
	double price;
	int color;
	int freshness;
	double flen;
	
	public Flower(){}
	
	Flower(String name, double price, int color, int freshness, double flen){
		this.name = name;
		this.price = price;
		this.color = color;
		this.freshness = freshness;
		this.flen = flen;
	}
	
	double getPrice() {
		return price;
	}
	int getFresh() {
		return freshness;
	}

	double getLength() {
		return flen;
	}
	
	@Override
	public String toString() {
		return name+" : (price: " +price+" UAN, freshness: "
				+freshness+"%, length: "+flen+" cm)";
	}

}
