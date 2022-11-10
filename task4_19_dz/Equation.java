package task4_19_dz;

public class Equation {
	
	EquationFunction fun;
	double ans;
	double a,b;
	
	Equation(EquationFunction fun,double ans,double a,double b){
		this.fun=fun;
		this.ans=ans;
		this.a=a;
		this.b=b;
	}
	
	double solving(double eps) {
		double l=a,r=b;
		double m=(r+l)/2;
		
		while(r-l>eps) {
			//System.out.println("l="+l+" r="+r+" m="+m+" f(m)="+fun.solve(m));
			if (fun.solve(m)>=ans)//(Math.signum(fun.solve(m))!=Math.signum(fun.solve(l)))//
				r=m;
			else
				l=m;
			m=(r+l)/2;
			
		}
		//System.out.println("l="+l+" r="+r+" m="+m);
		return l;
	}
	
	

}
