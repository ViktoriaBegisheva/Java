package lab12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task1_14 {

	public static void main(String[] args) throws FileNotFoundException {
		// 1.14
		
		ArrayList<String> lst = new ArrayList<String>();
		String fname = "task1_1.txt";
		
		FileReader fr = new FileReader(fname);
		Scanner sc = new Scanner(fr);
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            lst.add(line);
        }
        Collections.sort(lst);
        
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + lst);
        sc.close();
		
	}

}
