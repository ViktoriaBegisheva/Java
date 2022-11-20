package lab10;

public class Task2_17_dz {

	static String changeCharAfter(String A,char s,char c) {

		char[] masA = new char[A.length()];
		A.getChars(0, A.length(), masA, 0);
		
		String ans = "";
		int p=0;
		for (char a:masA) {
			int r=0;
			if (p==1) {
				ans+=c;
				r=1;
				p=0;
			}
			if (a==s)
				p=1;
			if (r!=1)
				ans+=a;
			
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// 2.17 dz
		String s = "sds..fjiv.jidh.jisni.kr";
		String newS = changeCharAfter(s,'.',' ');
		System.out.println(s+"\n"+newS);

	}

}
