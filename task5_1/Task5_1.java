package task5_1;
import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		// 5.1
		int maxLine=10,maxWord=50;
		
		Scanner sc = new Scanner(System.in);
		Sentence[] sents = new Sentence[maxLine];
		String line = sc.nextLine();
		int l=0;
		while(!line.trim().isEmpty()) {
			String[] wordsStrArr = line.split(" ");
			Word[] wordsArr = new Word[wordsStrArr.length];
			
			for (int i=0;i<wordsStrArr.length;i++)
				wordsArr[i]=new Word(wordsStrArr[i]);
			
			Sentence newSent = new Sentence(wordsArr);
			sents[l] = newSent;
			l++;
			if (l==maxLine)break;
			line = sc.nextLine();
		}
		Text text = new Text(sents);
		System.out.println(text);
		sc.close();

	}

}
