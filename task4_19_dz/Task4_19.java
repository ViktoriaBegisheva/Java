package task4_19_dz;

interface EquationFunction{
	double solve(double x);
}

class Task4_19 {
	
	public static void main(String[] args) {
		// 4.19
		
		EquationFunction expEqua = (x) -> {
			// e^x+e^2x=5
			return Math.exp(x)+Math.exp(2*x)-5;
		};
		double[] coeff={1,2,3,4,5,6};
		EquationFunction polyEqua = (x) -> {
			// 1*x^5+2*x^4+...+5*x+6=0
			double ans=0;
			int n=6;
			for (int i=0;i<n;i++)
				ans+=coeff[i]*Math.pow(x,n-i-1);
			return ans;
		};
		EquationFunction sinEqua = (x) -> {
			// x/sin(x)=3
			return x/Math.sin(x)-3;
		};
		//
		//System.out.println(expEqua.solve(0));
		double exp = 0.000001;
		Equation eqEx = new Equation(expEqua,0,-5,5);
		double x_e=eqEx.solving(exp);
		System.out.println("\ne^x+e^2x=5\nx = "+x_e);
		System.out.println("fun(x) = "+Math.round(expEqua.solve(x_e)));
		
		Equation eqPol = new Equation(polyEqua,0,-5,5);
		double x_p=eqPol.solving(exp);
		System.out.println("\n1*x^5+2*x^4+...+5*x+6=0\nx = "+x_p);
		System.out.println("fun(x) = "+Math.round(polyEqua.solve(x_p)));

		Equation eqSin = new Equation(sinEqua,0,0,3);
		double x_s=eqSin.solving(exp);
		System.out.println("\nx/sin(x)=3\n x = "+x_s);
		System.out.println("fun(x) = "+Math.round(sinEqua.solve(x_s)));
	}

}
