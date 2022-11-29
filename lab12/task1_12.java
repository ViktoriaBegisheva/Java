package lab12;

import java.util.ArrayList;
import java.util.Arrays;

public class task1_12 {
	
	static ArrayList<Double> multiplyPoly(ArrayList<Double> p1,
			ArrayList<Double> p2) {
		Double[] newPoly = new Double[p1.size()+p2.size()-1];
		
		for(int i=0;i<p1.size();i++) {
			for(int j=0;j<p2.size();j++){
				if(newPoly[i+j]==null)
					newPoly[i+j]=0.0;
				newPoly[i+j] += p1.get(i)*p2.get(j);
			}
		}
		return new ArrayList<Double>(Arrays.asList(newPoly));
	}
	
	static void printPoly(ArrayList<Double> poly) {

		int n = poly.size();
		for (int i=0;i<n-2;i++) {
			System.out.print(poly.get(i).toString()+"*x^"+(n-i-1)+" + ");
		}
		System.out.print(poly.get(n-2).toString()+"*x"+" + "+poly.get(n-1).toString()+"\n");
	}

	public static void main(String[] args) {
		// 1.12
		// multiply polynomials
		
		Double[] p01= {1.3,2.5,2.6};
		Double[] p02= {1.4,2.9,2.1,8.5};
		ArrayList<Double> p1 = new ArrayList<Double>(Arrays.asList(p01));
		ArrayList<Double> p2 = new ArrayList<Double>(Arrays.asList(p02));
		printPoly(p1);
		printPoly(p2);
		
		ArrayList<Double> p12 = multiplyPoly(p1,p2);
		printPoly(p12);
		

	}

}
