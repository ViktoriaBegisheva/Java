package lab11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task5_1 {
	
	public static String longestWord(String filename) throws IOException {
		String maxW="";
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] words = s.split("\\s+");
			for(String w:words) {
				if (w.length()>maxW.length()) {
					maxW=w;
				}
			}
		}
		sc.close();
		return maxW;
		
	}

	public static int numberWordsInFile(String filename) throws IOException {
		int num=0;
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] words = s.split("\\s+");
			num+=words.length;
		}
		sc.close();
		return num;
		
	}
	
	public static void replaceSpace(String filename,String outfilename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		FileWriter fw = new FileWriter(outfilename);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] words = s.split("\\s+");
			String newS = String.join(" ",words);
			fw.write(newS.trim()+"\n");
		}
		System.out.println("replaceSpace");
		fw.close();
		sc.close();
	}
	
	public static void replaceSpaceAndWordsLenLesOne(String filename,String outfilename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		FileWriter fw = new FileWriter(outfilename);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] words = s.split("\\s+");
			
			for (String w:words) {
				if(w.length()>1)
					fw.write(w+" ");
			}
			fw.write("\n");
		}
		System.out.println("replace Space And Words Len Less One");
		fw.close();
		sc.close();
	}
	
    public static void justification(String filename,String outfilename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		FileWriter fw = new FileWriter(outfilename);
		
		int symbols = 0;
		int k_words = 0;
		int m;
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] words = s.trim().split("\\s+");
			
			symbols = s.length();
			k_words = words.length;
			
			for (String w:words) {
				fw.write(w);
				if (words.length<=1)
					break;
				m = (80-symbols)/(k_words-1);
				for(int i=0;i<m;++i)
					fw.write(" ");
			}
			fw.write("\n");
			
		}
		System.out.println("justification File");
		fw.close();
		sc.close();
		
	}
	
    
	public static void main(String[] args) {
		String fname="lab11_task1.txt";
		String fout="lab11_task1_out.txt";
		
		try {
			// 1.a
			System.out.println("longest Word: "+longestWord(fname));
			
			// 1.b
			System.out.println("Number of words in file: "+numberWordsInFile(fname));
			
			// 1.c
			replaceSpace(fname,fout);

			// 1.d
			replaceSpaceAndWordsLenLesOne(fname,fout);
			
			// 1.e
			justification(fname,fout);
			 
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
