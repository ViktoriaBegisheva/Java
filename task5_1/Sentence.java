package task5_1;

public class Sentence {
	Word[] sentence;
	Sentence(int maxWord){
		sentence = new Word[maxWord];
	}
	Sentence(Word[] words){
		sentence = words.clone();
	}
	
	void upperFirst() {
		if (sentence[0]!=null)
			sentence[0].word = sentence[0].word.substring(0,1).toUpperCase()+sentence[0].word.substring(1);
	}
	
	@Override
	public String toString() {
		if (sentence[0]==null) return "<empty>";
		upperFirst();
		String s = "";
		for (Word w:sentence)
			s+=" "+w.toString();
		return s.substring(1);
	}
}
