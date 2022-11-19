package task8_1;

public class Meal extends Item{
	int weight;
	Meal(){
		this.type="meal";
	}
	Meal(float price,String name){
		super(price,name,"meal");
	}
	Meal(float price,String name,int weight){
		super(price,name,"meal");
		this.weight=weight;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	@Override
	public String toString() {
		if (weight!=0)
			return "Meal: "+super.toString()+", weight: "+weight+"kg";
		return "Meal: "+super.toString();

	}
}

