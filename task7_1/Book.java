package task7_1;

abstract class Book implements Edition{
	String name;
	String type;
	String autor;
	int pagesNumber;
	
	Book(){}
	Book(String name,String type,String autor,int pagesNumber){
		this.name = name;
		this.type = type;
		this.autor = autor;
		this.pagesNumber = pagesNumber;
	}
	
	@Override
	public String toString() {
		return "<<"+name+">>: {type: "+type+
				"; autor: "+autor+"; number of pages: "+pagesNumber+"}";
	}
	
	@Override
	public void printb() {
		System.out.println(type+" <<"+name+">> is printing!");
	}
	
	@Override
	public void advertise() {
		System.out.println(type+" <<"+name+">> is advertise!");
	}
	@Override
	public void popular() {
		System.out.println("And now "+type+" <<"+name+">> is popular!");
	}
	
}
