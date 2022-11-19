package task8_1;

public class Item {
	
	float price;
	String name;
	String type;
	
	Item(){}
	
	Item(float price,String name,String type){
		this.price=price;
		this.name=name;
		this.type=type;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void setType(String type) {
		this.type=type;
	}
	@Override
	public String toString() {
		return name+", type: "+type+", price: "+price;
	}

}
