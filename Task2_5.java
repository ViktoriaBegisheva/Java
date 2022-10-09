package lab3;

public class Task2_5 {
	public static void main(String[] args) {
		
		//2.5 (dz)
		
		long n=130,m;
		int i=0;
	    long k=1<<15;
	    //System.out.println(n&1);
	    long w;
	    for (i=16-1;i>=0;i--) {
	    	w=n&k;
	    	if (w!=0)
	    		break;
	    	k=k>>1;
	    }
	    System.out.println(Long.toBinaryString(n));
	    m=1<<i;
	    m=~m;
	    n=n&m;
	    System.out.println(Long.toBinaryString(n));
	    n<<=1;
	    System.out.println(Long.toBinaryString(n));
	    n+=1;
	    System.out.println(Long.toBinaryString(n));
	    
	    System.out.println(n);
	    	
	    
	}
}
