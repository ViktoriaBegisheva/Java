package task5_1;

public class Text {
	Sentence[] text;
	String header;
	Text(int maxLine){
		text = new Sentence[maxLine];
	}
	Text(Sentence[] sentence){
		header = "Text";
		text = sentence.clone();
	}
	Text(String header,Sentence[] sentence){
		text = sentence.clone();
		this.header=header;
	}
	
	@Override
	public String toString() {
		String txt="";
		System.out.println("\t\t<< "+header+" >>");
		for(Sentence s:text){
			if (s!=null)
				txt+=s+".\n";
		}
		return txt;
	}
	
}
