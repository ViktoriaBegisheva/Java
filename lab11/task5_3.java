package lab11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

interface Expression{
    boolean isEqual(String s,char a);
}

public class task5_3 {
	
	public static void printRows(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		System.out.println("printRows from file "+filename);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		System.out.println();
		sc.close();
	}
	
	public static void printRowsWithLength(String filename,int len) throws IOException {
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		System.out.println("printRows from file '"+filename+"' with len more than "+len);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.length()>len)
				System.out.println(s);
		}
		sc.close();
	}
	
	public static int countFunction(String filename,Expression fun,char a) throws IOException {
		int count=0;
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.length()<1)
				continue;
			if (fun.isEqual(s,a))
				count++;
		}
		sc.close();
		return count;
		
	}

	public static void main(String[] args) {

		String fname="lab11_task3.txt";

		try {
			
			// 3.a
			printRows(fname);
			
			// 3.b
			printRowsWithLength(fname,10);
			
			// 3.c
			Expression startWithChar = (s,a)-> s.substring(0, 1).equals(a+"");
			char c1='a';
			System.out.println("\nnumber of rows start with char '"+c1+"' = "+countFunction(fname,startWithChar,c1));
			
			// 3.d
			Expression endWithChar = (s,a)-> s.substring(s.length()-1).equals(a+"");
			char c2='a';
			System.out.println("\nnumber of rows end with char '"+c2+"' = "+countFunction(fname,endWithChar,c2));

			// 3.e
			Expression startAndEndWithChar = (s,a)-> s.substring(s.length()-1).equals(s.substring(0, 1));
			char c3='a';
			System.out.println("\nnumber of rows start and end with same char = "+countFunction(fname,startAndEndWithChar,c3));
			
			// 3.f
			Expression sameChars = (s,a) -> {
				boolean p=true;
				for (int i=1;i<s.length();i++) 
					p=p&&s.substring(i-1,i).equals(s.substring(0, 1));
				return p;};
			System.out.println("\nnumber of rows contain same chars = "+countFunction(fname,sameChars,c3));

		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
