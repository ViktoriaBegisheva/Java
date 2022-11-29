package lab12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class task1_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// 1.1
		
		LinkedList<String> lst = new LinkedList<String>();
		String fname = "task1_1.txt";
		
		FileReader fr = new FileReader(fname);
		Scanner sc = new Scanner(fr);
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            lst.add(line);
        }
        for(int i=lst.size()-1;i>=0;i--) {
        	System.out.println(lst.get(i)+" ");
        }
		sc.close();
	}

}
