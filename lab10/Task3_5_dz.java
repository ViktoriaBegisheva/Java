package lab10;

public class Task3_5_dz {
	
	static String replaceCharWithStr(String str,char c, String c1) {
		String newStr="";
		
		char[] masStr = new char[str.length()];
		str.getChars(0, str.length(), masStr, 0);
		
		for (char a:masStr) {
			if (a==c) {
				newStr+=c1;
				continue;
			}
			newStr+=a;
		}
		return newStr;
	}
	static String function(String A) {
		A=replaceCharWithStr(A,'.', "...");
		A=A.replace('!', '.');
		A=A.replace('*', '+');
		return A;
	}
	
	public static void main(String[] args) {
		// 3.5 dz
		String s = "sds!fjiv.jidh!jisni*kr";
		String newS = function(s);
		System.out.println(s+"\n"+newS);

	}

}
