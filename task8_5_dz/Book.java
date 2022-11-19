package task8_5_dz;

abstract class Book{
	String name;
	String type;
	String author;
	
	Book(){}
	Book(String name,String type,String autor){
		this.name = name;
		this.type = type;
		this.author = autor;
	}
	public String getName() {
		return "<<"+name+">>";
	}
	
	public boolean equals(Book other) {
		if (other==null)
			return false;
		if (this.name != other.name)
			return false;
		if (this.type != other.type)
			return false;
		if (this.author != other.author)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "<<"+name+">>: (type: "+type+
				"; autor: "+author+")";
	}
	
	
}
