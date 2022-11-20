package lab10;

import java.util.Scanner;

public class Task1_cw {
	
	
	
	// 6.1
	static int numberWords(String str) {
		String[] words = str.split(" ");
		int k=0;
		//w.trim() delete space
		for (String w:words) {
			if(!w.equals("-")&&w.trim().length()>0&&
					!w.equals("+")&&!w.equals("=")) {
				k++;
			}
		}
		return k;
	}
	
	// 6.2
	static StringBuffer inversStr(String str) {
		StringBuffer ans= new StringBuffer(str);
		return ans.reverse();
	}
	// 6.3
	static String raplaceWords(String str,String a,String b) {
		String[] words = str.split(" ");
		String ans = "";
		for (String w:words) {
			if (cleanStr(w).equals(a))
				ans+=b+" ";
			else
				ans+=w+" ";
		}
		return ans;
	}
	// 6.4
	static String delWord(String str,String a) {
		String[] words = str.split(" ");
		String ans = "";
		for (String w:words) {
			if (!cleanStr(w).equals(a))
				ans+=w+" ";
		}
		return ans;
	}
	//6.5
	static String addWordsBefore(String str,String a,String b) {
		String[] words = str.split(" ");
		String ans = "";
		for (String w:words) {
			if (cleanStr(w).equals(a))
				ans+=b+" ";
			ans+=w+" ";
		}
		return ans;
	}
	//6.6
	static StringBuffer addStringToTheEnd(String str,String a) {
		StringBuffer ans = new StringBuffer(str);
		return ans.append(a);
	}
	
	//6.7
	static void countChar(String str) {
		char[] masStr = new char[str.length()];
		str.getChars(0, str.length(), masStr, 0);
		int countC = 0;
		int countOthPunc = 0;
		int countPoin = 0;
		
		for(char c:masStr) {
			if(c=='.'||c=='!'||c=='?') 
				countPoin++;
			else if(c==','||c=='-'||
					c==';'||c==':'||c==' ') 
				countOthPunc++;
			else if(c>='a'&&c<='z'||c>='A'&&c<='Z') 
				countC++;
		}
		System.out.println("String contains:\nchars: "+countC
				+"; words: "+numberWords(str)
				+"; punct: "+(countPoin+countOthPunc)
				+"; sentence: "+countPoin);
		
	}
	
	static String cleanStr(String str) {
		String newStr = "";
		char[] masStr = new char[str.length()];
		str.getChars(0, str.length(), masStr, 0);
		String other =".,;!?:";
		for (char c:masStr) {
			if (other.contains(c+""))
				continue;
			newStr+=c;
		}
		return newStr;
	}
	
	// 6.8
	static boolean checkWord(String str,String word) {
		String newStr = cleanStr(str);
		String[] words = newStr.split(" ");
		for (String w:words) {
			if(w.equals(word)) {
				return true;
			}
		}
		return false;
	}
	
		

	public static void main(String[] args) {
		
		/**
		 * String s = args[0];
		 */
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// 6.1
		System.out.println("6.1 \nNumber of words is "+numberWords(s));
		
		// 6.2
		System.out.println("6.2 \nInvers string: "+inversStr(s));

		// 6.3
		String a="small";
		String b="very large";
		System.out.println("6.3 \nraplaceWords '"+a+"' to '"+b+"': "+raplaceWords(s,a,b));

		// 6.4
		String a4="a";
		String b4="an";
		String s4=delWord(s,a4);
		s4 = delWord(s4,b4);
		System.out.println("6.4 \ndelWord '"+a4+"' and '"+b4+"': "+s4);

		// 6.5
		String a51="small";
		String a52="large";
		String b5="very";
		String s5=addWordsBefore(s,a51,b5);
		s5 = addWordsBefore(s5,a52,b5);
		System.out.println("6.5 \nadd '"+b5+"' before '"+a51+"' and '"+a52+"': "+s5);
		
		// 6.6
		String a6 = " ,that we use to ilustrate the methods of class StringBuffer";
		System.out.println("6.6 \nadd string to the end: "+addStringToTheEnd(s,a6));
		
		// 6.7
		System.out.println("6.7");
		countChar(s);

		// 6.8
		String word="Small";
		System.out.println("6.8\n"+"(with register) word '"+word
				+"' contains in str: "+checkWord(s,word)
				+"\n"+"(without register) word '"+word
				+"' contains in str: "+checkWord(s.toLowerCase(),word.toLowerCase()));
		
		//small; a an dhf - a jcdsfhjh small. df an! large smal fj df?
		sc.close();
		

	}

}
