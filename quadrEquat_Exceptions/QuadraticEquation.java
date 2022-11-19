package quadrEquat_Exceptions;

class MyException extends Exception {
	String message;
	MyException(String str) {
		message=str;
	}
	@Override
	public String toString() {
		return "Exception: "+message;
	}
}

public class QuadraticEquation {
	
	double a,b,c,x1,x2;
	
	QuadraticEquation(Object a,Object b,Object c) throws MyException {
		try {
			if(!(a instanceof Double)||
					!(b instanceof Double)||
					!(c instanceof Double))
				throw new MyException("Wrong type of coefficients!");
			this.a=(double)a;
			this.b=(double)b;
			this.c=(double)c;
			if(this.a==0)
				throw new MyException("a==0 -> Equation not Quadratic");
			System.out.println(a+"*x^2 + "+b+"*x + "+c+" = 0");
			solve();
		}catch(MyException e) {
			System.out.println(e);
		}
	}
	
	public void solve() throws MyException {
		try {
			double d=Math.pow(b,2)-4*a*c;
			if (d<0)
				throw new MyException("Discriminant < 0 -> Equation haven't solutions!");
			
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
		}catch(MyException e) {
			System.out.println(e);
			return;
		}
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		if (x1==x2)
			return "x = "+x1;
		return "x1 = "+x1+"; x2 = "+x2;
	}

	public static void main(String[] args) throws MyException {
		double a1 = -1,b1 = 4,c1 = -4;
		QuadraticEquation eq = new QuadraticEquation(a1,b1,c1);

		//d < 0
		System.out.println("");
		double c2 = 10;
		QuadraticEquation eq1 = new QuadraticEquation(a1,b1,c2);
		
		// a == 0
		System.out.println("");
		double a2 = 0;
		QuadraticEquation eq2 = new QuadraticEquation(a2,b1,c1);
		
		// type a - not double
		System.out.println("");
		QuadraticEquation eq3 = new QuadraticEquation("2o",b1,c1);
		
	}

}
