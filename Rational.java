package lab6;

public class Rational {
	
	private int n;
	private int m;
	
	Rational(){
		n=0;
		m=1;
	}
	
	Rational(int n0,int m0){
		n=n0;
		m=m0;
		reduce();
	}
	
	@Override
	public String toString() {
		return n+"/"+m;
	}
	
	private int gcd(int a,int b) {
		if (a==0)
			return b;
		while (b!=0) {
			if (a>b)
				a=a-b;
			else
				b=b-a;
		}
		//System.out.println(a0+" b ;"+b0+" gcd: "+a);
		return a;
	}
	
	private void reduce() {
		if (n!=0) {
			int c = gcd(Math.abs(n),m);
			n /= c;
			m /= c;
		}
	}
	
	public Rational converse() {
		return new Rational(m,n);
	}
	
	public Rational sum(Rational other) {
		Rational c  = new Rational(n*other.m+m*other.n,m*other.m);
		c.reduce();
		return c;
	}
	
	public Rational sub(Rational other) {
		Rational c  = new Rational(n*other.m-m*other.n,m*other.m);
		c.reduce();
		return c;
	}
	
	public Rational mul(Rational other) {
		Rational c  = new Rational(n*other.n,m*other.m);
		c.reduce();
		return c;
	}
	
	public Rational div(Rational other) {
		return mul(other.converse());
	}
	
	public Rational[] task(Rational[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i].sum(arr[i+1]);
		}
		return arr;
	}
	

}
