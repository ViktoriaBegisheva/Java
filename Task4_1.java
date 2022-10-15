package lab4;

public class Task4_1 {

	public static void main(String[] args) {

		//4.1
		
		int p,q;
		
		if(args.length<2) {
			System.out.println("Not enough input arguments!");
			return;
		}
		
		p = Integer.valueOf(args[0]);
		q = Integer.valueOf(args[1]);
		
		double r = (double) p/q;
		
		String repr=Double.toString(r);
		System.out.println(repr);
		
		char[] prev = new char[30];
		int k1=0;
		String ans="";
		int point = repr.indexOf(".");
		
		if(repr.length()<point+10) {
			ans=repr;
		}
		else{
			int i=point+1,j=0,l=0,i0=0,len=0;
			boolean found = false;
			char c = repr.charAt(i);
			for(i=point+1;i<repr.length()-1;i++) {
				c = repr.charAt(i);
				for (j=0;j<k1;j++) {
					if(c==prev[j]) {
					    i0=i;
						found=true;
						len=1;
						for (l=j+1;l<k1;l++) {
						    if (i0+1>=repr.length()-1) {
								found=true;
								break;
							}
							i0++;
							char c0 = repr.charAt(i0);
							found = c0==prev[l];
							if (found==false)break;
							len++;
						}
						if (found)break;
					}
				}
			    if (found)break;
				prev[k1++]=c;
			}
			System.out.println(len);
			ans=repr.substring(0, i-len);
			ans+="(";
			ans+=repr.substring(i-len,i);
			ans+=")";
		}
		//System.out.println(prev);
		System.out.println("Answer: "+ans);
		
		//**/8639 70000
		
		

	}

}
