package lab11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task5_8_dz {
	
	public static void positivNums(String filename,String outfilename) throws IOException {
		
		System.out.println("positivNums from file '"+
		filename+"' to file "+outfilename+"'");
		
		FileReader fr = new FileReader(filename);
		Scanner sc = new Scanner(fr);
		FileWriter fw = new FileWriter(outfilename);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] num = s.trim().split("\\s+");
			for (String i:num) {
				if(!i.substring(0,1).equals("-"))
					fw.write(i+" ");
			}
			fw.write("\n");
		}
		fw.close();
		sc.close();
	}
	
	public static void main(String[] args) {
		
		String fname="lab11_task8_dz.txt";
		String fout="lab11_task8_out.txt";
		
		try {
			// 8 dz
			positivNums(fname,fout);
			

		}
		catch(IOException e) {
			e.printStackTrace();
		}

	
	}

}
