package task5_1;

public class Word {
	String word;
	
	Word(){word = "";}
	Word(String w){word=w;}
	int getLen() {return word.length();}
	
	@Override
	public String toString() {return word;}
}
