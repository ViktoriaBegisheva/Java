package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import numbers.NewNumber;
import polynome.Polynomial;

public class Test {
	
	public static Polynomial[] sumPolys(Polynomial[] polys) {
		Polynomial[] answer = new Polynomial[polys.length];
		Polynomial ans = new Polynomial();
		for(Polynomial p: polys) {
			if (p==null)
				break;
			ans = ans.addPoly(p);
		}
		answer[0]=ans;
		return answer;
	}

	public static Polynomial[] subtractPolys(Polynomial[] polys) {
		Polynomial[] answer = new Polynomial[polys.length];
		Polynomial ans = new Polynomial();
		for(Polynomial p: polys) {
			if (p==null)
				break;
			ans = ans.subtractPoly(p);
		}
		answer[0]=ans;
		return answer;
	}
	
	public static Polynomial[] multiplyPolys(Polynomial[] polys) {
		Polynomial[] answer = new Polynomial[polys.length];
		Polynomial ans = new Polynomial();
		for(Polynomial p: polys) {
			if (p==null)
				break;
			ans = p.multiplyPoly(ans);
		}
		answer[0]=ans;
		return answer;
	}
	
	public static Polynomial[] derivativePolys(Polynomial[] polys) {
		Polynomial[] answer = new Polynomial[polys.length];
		int i=0;
		for(Polynomial p: polys) {
			if (p==null)
				break;
			answer[i]=p.derivative();
			i++;
		}
		return answer;
	}
	
	public static Polynomial[] integralPolys(Polynomial[] polys) {
		Polynomial[] answer = new Polynomial[polys.length];
		int i=0;
		for(Polynomial p: polys) {
			if (p==null)
				break;
			answer[i]=p.integral();
			i++;
		}
		return answer;
	}
	
	public static Polynomial[] defineIntegralPolys(Polynomial[] polys) {
		Polynomial[] answer = new Polynomial[polys.length];
		Scanner scn = new Scanner(System.in);
		int i=0;
		for(Polynomial p: polys) {
			if (p==null)
				break;
			System.out.print("\ninput low bound a of integral: ");
			int a0 = scn.nextInt();
			System.out.print("input high bound b of integral: ");
			int b0 = scn.nextInt();
			NewNumber a = polys[0].getNum(a0);
			NewNumber b = polys[0].getNum(b0);
			NewNumber ans =p.defineIntegral(a,b);
			Polynomial pNew = new Polynomial(new 
					ArrayList<NewNumber>(Arrays.asList(ans)));
			answer[i]=pNew;
			i++;
		}
		return answer;
	}
	
	public static Polynomial[] readPolysFromFile(String filename) throws IOException {
		Polynomial[] polys = new Polynomial[10];
		int i=0;
		FileReader fr = new FileReader(filename);
		Scanner scn = new Scanner(fr);
		while (scn.hasNext()) {
			String s = scn.nextLine();
			if (s==null)
				break;
			polys[i]= new Polynomial(s);
			i++;
		}
		scn.close();
		fr.close();
		return polys;
	}
	
	public static Polynomial[] inputPolys(int n) {
		Polynomial[] polys = new Polynomial[n];
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			String s = scn.nextLine();
			polys[i]= new Polynomial(s);
		}
		return polys;
		
	}
	
	public static void writePolysToFile(String outFilename, Polynomial[] ans) throws IOException {
		FileWriter fw = new FileWriter(outFilename);
		for(Polynomial p: ans){
			if (p==null)
				break;
			fw.write(p.toString()+"\n");
		}
		fw.close();
		
	}

	public static void printPolys(Polynomial[] ans) {
		for(Polynomial p: ans){
			if (p==null)
				break;
			System.out.println(p);
		}
	}
	
	
	public static void main() throws IOException {
		System.out.println("1. read from file\n2. input");
		Scanner sc = new Scanner(System.in);
		int fist = sc.nextInt();

		Polynomial[] polys = null;
		if (fist==1) {
			sc.nextLine();
			System.out.println("Input filename: ");
			String filename = sc.nextLine();
			polys = readPolysFromFile(filename);
		}
		else if (fist==2) {
			System.out.println("How many polinomials you want input?");
			int n = sc.nextInt();
			polys = inputPolys(n);
			
		}
		System.out.println("How many option you want do?");
		int N = sc.nextInt();

		for (int i=0;i<N;i++) {
			System.out.print("1. sum all polynomial from file\n"
					+ "2. subtract all polynomial\n"
					+ "3. multiply all polynomial\n"
					+ "4. find derivative for all polynomial\n"
					+ "5. find integral for all polynomial\n"
					+ "6. find define integral for all polynomial\n");
		    int second;
		    second= sc.nextInt();
		    Polynomial[] calc=null;
			if(second==1)
				calc=sumPolys(polys);
			else if(second==2)
				calc=subtractPolys(polys);
			else if(second==3)
				calc=multiplyPolys(polys);
			else if(second==4)
				calc=derivativePolys(polys);
			else if(second==5)
				calc=integralPolys(polys);
			else if(second==6)
				calc=defineIntegralPolys(polys);

			//sc.nextInt();
			System.out.println("How you want see result?\n"
					+ "1. write to file\n2. print");
			int last = sc.nextInt();
			
			if (last==1) {
				sc.nextLine();
				System.out.println("Input filename:");
				String outFilename = sc.nextLine();
				writePolysToFile(outFilename,calc);
			}
			else if (last==2) {
				printPolys(calc);
			}
		}
		
	}
	
}
