package polynome;

import java.util.ArrayList;

import numbers.EnumNumber;
import numbers.NewNumber;
import numbers.Rational;

public class Polynomial {
	// a0*x^n + a1*x^n-1 + ... + an-1*x + an
	ArrayList<NewNumber> coef;
	
	public Polynomial(){
		coef=new ArrayList<NewNumber>();
	}
	
	public Polynomial(ArrayList<NewNumber> coef){
		this.coef=coef;
	}
	
	public Polynomial(String pol){
		coef=new ArrayList<NewNumber>();
		String[] p0 = pol.split("\\+");
		String[] dod = p0[0].split("\\*");
		if (dod.length==1) {
			coef.add(new Rational(dod[0]));
			return;
		}
		String[] n0 = dod[1].split("\\^");
		int n;
		if (n0.length==1)
			n=1;
		else
			n = Integer.parseInt(n0[1].trim());

		for (int i=0;i<=n;i++)
			coef.add(new Rational(0));
		for(String p:p0) {
			String[] dod0 = p.split("\\*");
			int ind;
			if (dod0.length==1) {
				ind = 0;
			}
			else {
				String[] n00 = dod0[1].split("\\^");
				if (n00.length==1)
					ind=1;
				else
					ind = Integer.parseInt(n00[1].trim());
			}
			coef.set(n-ind,new Rational(dod0[0].trim()));	
		}
	}
	
	public NewNumber getNum(int n) {
		if (coef.size()==0)
			return NewNumber.getEnum(n,EnumNumber.RATIONAL);
		return coef.get(0).getEnum(n);
	}
 	
	private Polynomial higherDeg(Polynomial b) {
		if (b==null)
			return this;
		if (coef.size()>=b.coef.size())
			return this;
		return b;
	}
	
	public NewNumber valueAtPoint(NewNumber x) {
		NewNumber ans = getNum(0);
		for (int i=0;i<coef.size();i++){
			ans = ans.add(coef.get(i).multiply(x));
		}
		return ans;
	}
	
	public Polynomial derivative() {
		Polynomial derPoly = new Polynomial();
		for (int i=0;i<coef.size()-1;i++) {
			derPoly.coef.add(coef.get(i).
					multiply(getNum(this.coef.size()-i-1)));
		}
		return derPoly;
	}
	
	public Polynomial integral() {
		Polynomial derPoly = new Polynomial();
		int i=0;
		for (i=0;i<coef.size();i++) {
			derPoly.coef.add(coef.get(i).
					divide(getNum(this.coef.size()-i)));
		}
		derPoly.coef.add(getNum(0));
		return derPoly;
	}
	
	public NewNumber defineIntegral(NewNumber a,NewNumber b) {
		Polynomial derPoly = integral();
		NewNumber ans = derPoly.valueAtPoint(b).subtract(derPoly.valueAtPoint(a));
		return ans;
	}

	public Polynomial addPoly(Polynomial other) {
		Polynomial hD = this.higherDeg(other);

		int n1,n2;
		if(other==null) {
			n1 = coef.size();n2 = 0;	
		}
		else{
			n1 = coef.size(); n2 = other.coef.size();
		}
		
		for(int i=n1-1,j=n2-1;Math.min(i, j)>=0;i--,j--) {
			hD.coef.set(Math.max(i,j),coef.get(i).add(other.coef.get(j)));
		}
		return hD;
	}
	
	
	public Polynomial subtractPoly(Polynomial other) {
		Polynomial hD = this.higherDeg(other);
		int n1,n2;
		if(other==null) {
			n1 = coef.size();n2 = 0;	
		}
		else{
			n1 = coef.size(); n2 = other.coef.size();
		}
		for(int i=n1-1,j=n2-1;Math.min(i, j)>=0;i--,j--) {
			hD.coef.set(Math.max(i,j),coef.get(i).subtract(other.coef.get(j)));
		}
		return hD;
	}
	
	
	public Polynomial multiplyPoly(Polynomial other) {
		Polynomial newPoly = new Polynomial();
		int n1,n2;
		if(other.coef.size()==0) {
			return this;
		}
		else{
			n1 = coef.size(); n2 = other.coef.size();
		}
		for (int i=0;i<n1+n2-1;i++)
			newPoly.coef.add(getNum(0));
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++){
				newPoly.coef.set(i+j,newPoly.coef.get(i+j).
						add(coef.get(i).multiply(other.coef.get(j))));
			}
		}
		return newPoly;
	}

	@Override
	public String toString() {
		String pol = "";
		int n = coef.size();
		if (n==1)
			return coef.get(n-1).toString();
		else if (n==0)
			return pol;
		for (int i=0;i<n-2;i++) {
			if(coef.get(i)!=null)
				pol+=coef.get(i).toString()+"*x^"+(n-i-1)+" + ";
		}
		if(coef.get(n-2)!=null)
			pol+=coef.get(n-2).toString()+"*x"+" + "+coef.get(n-1).toString();
		return pol;
	}
	
	
}
