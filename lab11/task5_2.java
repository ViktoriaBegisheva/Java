package lab11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task5_2 {
	
	public static int emptyRows(String filename) throws IOException {
		int emp=0;
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.equals(""))
				emp++;
		}
		sc.close();
		return emp;
		
	}
	
	public static int longestRow(String filename) throws IOException {
		int maxL=0;
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.length()>maxL)
				maxL=s.length();
		}
		sc.close();
		return maxL;
		
	}

	public static void main(String[] args) {
		
		String fname="lab11_task2.txt";
		
		try {
			//2.a
			System.out.println("number of emply rows: "+emptyRows(fname));
			
			//2.b
			System.out.println("len of longest rows: "+longestRow(fname));
			

		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
