package lab6;

class Car{
	private int id;
	private String brand;
	private String model;
	private int year;
	private int price;
	private String number;
	
	
	Car(int id0,String brand0, String model0,
			int year0, int price0, String number0){
		id = id0;
		brand = brand0;
		model = model0;
		year = year0;
		price = price0;
		number = number0;
	}
	
	
	String getId(){
		return Integer.toString(id);
	}	
	String getBrand(){
		return brand;
	}	
	String getModel(){
		return model;
	}
	String getYear() {
		return Integer.toString(year);
	}
	String getPrice(){
		return Integer.toString(price);
	}
	String getNumber(){
		return number;
	}
	
	
	void setId(int i){
		id = i;
	}	
	void setFullName(String b,String m){
		brand = b;
		model = m;
	}
	void setYear(int y){
		year = y;
	}
	void setPrice(int p){
		price = p;
	}
	void setNumber(String t){
		number = t;
	}
	
	@Override
	public String toString() {
		String s="id: " + getId() +
				"; brand: " +  getBrand()
				+" (" + getModel() + ")"+
				"; year: " + getYear() +
				"; price: " + getPrice() +
				"; Number: " + getNumber();
		return s;
	}
	
	void checkBrand(String b) {
		if (getBrand()==b)
			System.out.println(toString());
	}
	
	void checkModelAndYear(String m, int y,int nowYear) {
		if (getModel()==m&&(nowYear - year)>y)
			System.out.println(toString());
	}
	
	void checkYearAndPrice(int y, int p) {
		if (year==y&&price>p)
			System.out.println(toString());
	}

	
}

public class Task2_8_dz {

	public static void main(String[] args) {
		// 2.8 (dz)
		
		Car[] car = new Car[5];
		car[0] = new Car(1, "A", "A", 2003, 2301000, "AA1234");
		car[1] = new Car(2, "B", "B", 2004, 2302000, "AA1111");
		car[2] = new Car(3, "A", "C", 2003, 2303000, "AA1454");
		car[3] = new Car(4, "A", "B", 2003, 2304000, "AA1231");
		car[4] = new Car(5, "A", "A", 2014, 2305000, "AA7634");
		
		// a
		String brand="A";
		System.out.println("\na) check Brand: "+brand);
		for(Car c: car) {
			c.checkBrand(brand);
		}
		
		// b
		String model = "A";
		int yearExp=10;
		System.out.println("\nb) check Model: "+model+" and YearExp: "+yearExp);
		int nowYear = 2022;
		for(Car c: car) {
			c.checkModelAndYear(model,yearExp,nowYear);
		}
		
		// c
		int Year=2003;
		int price=2302000;
		System.out.println("\nc) check Year: "+Year+" and Price: "+price);
		for(Car c: car) {
			c.checkYearAndPrice(Year,price);
		}
	}

}
