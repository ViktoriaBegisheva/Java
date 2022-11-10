package task4_1;

public class Polynomial {
	Rational[] coeff;
	
	Polynomial(int deg){
		coeff = new Rational[deg+1];
		coeff[0] = new Rational();
	}
	
	Polynomial(Rational[] coef){
		coeff = coef;
	}
	
	Polynomial(String s){
		String[] num = s.split(" ");
		coeff = new Rational[num.length];
		for (int i=0;i<num.length;i++) {
			coeff[i] = new Rational(num[i]);
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		int n = coeff.length;
		for (int i=0;i<n-2;i++) {
			s+=coeff[i].toString()+"*x^"+(n-i-1)+" + ";
		}
		s+=coeff[n-2].toString()+"*x"+" + "+coeff[n-1].toString();
		return s;
	}
	
	private Polynomial higherDeg(Polynomial b) {
		if (coeff.length>=b.coeff.length)
			return this;
		return b;
	}
	
	public Polynomial sumPoly(Polynomial b) {	
		int n1 = coeff.length, n2 = b.coeff.length;
		Polynomial c = higherDeg(b);
		for (int i=n1-1,j=n2-1;Math.min(i,j)>=0;i--,j--) {
			c.coeff[Math.max(i,j)]=coeff[i].sum(b.coeff[j]);
		}
		return c;
	}
	
	
	
}
