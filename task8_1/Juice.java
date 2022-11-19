package task8_1;

public class Juice extends Item{
	int ob;
	
	Juice(){
		type="liquid";
	}
	Juice(float price,String name){
		super(price,name,"liquid");
	}
	Juice(float price,String name,int ob){
		super(price,name,"liquid");
		this.ob=ob;
	}
	public float getOb() {
		return ob;
	}
	public void setOb(int ob) {
		this.ob=ob;
	}
	@Override
	public String toString() {
		if (ob==0)
			return "Juice: "+super.toString();
		return "Juice: "+super.toString()+", ob: "+ob+"l";
	}
}
