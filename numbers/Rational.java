package numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Rational extends NewNumber{
	private int n;
	private int m;
	//RATIONAL
	public Rational(){
		super(EnumNumber.RATIONAL,
				new ArrayList<Integer>(Arrays.asList(0,1)));
		n=0;
		m=1;
	}
	
	public Rational(int n0){
		super(EnumNumber.RATIONAL,
				new ArrayList<Integer>(Arrays.asList(n0,1)));
		n=n0;
		m=1;
	}
	
	public Rational(int n0,int m0){
		super(EnumNumber.RATIONAL,
				new ArrayList<Integer>(Arrays.asList(n0,m0)));
		n=n0;
		m=m0;
		reduce();
	}
	
	public Rational(NewNumber num) {
		super(EnumNumber.RATIONAL,num.value);
		if (num.value.size()==2) {
			n = (int) num.value.get(0);
			m = (int) num.value.get(1);
		}
		reduce();
	}
	
	public Rational(String r) {
		super(EnumNumber.RATIONAL);
		if (r.contains("/")) {
			n=Integer.parseInt(r.split("\\/")[0]);
			m=Integer.parseInt(r.split("\\/")[1]);
		}
		else {
			n=Integer.parseInt(r);
			m=1;
		}
		reduce();
		super.setValue(new ArrayList<Integer>(Arrays.asList(n,m)));
	}
	
	@Override
	public String toString() {
		if (m==1)
			return n+"";
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

	@Override
	public NewNumber add(NewNumber otherN) {
		Rational other = new Rational(otherN);
		Rational c  = new Rational(n*other.m+m*other.n,m*other.m);
		c.reduce();
		return c;
	}

	@Override
	public NewNumber subtract(NewNumber otherN) {
		Rational other = new Rational(otherN);
		Rational c  = new Rational(n*other.m-m*other.n,m*other.m);
		c.reduce();
		return c;
	}

	@Override
	public NewNumber multiply(NewNumber otherN) {
		Rational other = new Rational(otherN);
		Rational c  = new Rational(n*other.n,m*other.m);
		c.reduce();
		return c;
	}

	@Override
	public NewNumber divide(NewNumber otherN) {
		Rational other = new Rational(otherN);
		Rational c  = new Rational(n*other.m,m*other.n);
		c.reduce();
		return c;
	}

}
