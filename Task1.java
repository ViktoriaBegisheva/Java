package lab4;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
	
	static int min(int[] in) {
		int mi=in[0];
		for (Integer i:in) {
			if (i<mi)
				mi=i;
		}
		return mi;
	}
	static boolean fun1_8(String s) {
		if (s.length()==1)
			return true;
		for (int i=1;i<s.length();i++) {
			int a=Character.getNumericValue(s.charAt(i-1));
			int b=Character.getNumericValue(s.charAt(i));
			if (a>b)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		// 1.1
		System.out.println("1.1");
		String[] arr = {"a","b","c"};
		
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		for (String a:arr)
			System.out.println(a);
		
		
		// 1.3
		System.out.println("\n1.3 ");
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		double[] num = new double[n];
		double mean = 0.0,stdDeviation = 0.0;
		
		for (int j=0;j<n;j++) {
			num[j]=sc.nextDouble();
			mean += num[j]/n;
		}
		for (double d:num)
			stdDeviation+=Math.pow(d-mean, 2);
		System.out.println(mean+"; "+Math.sqrt(stdDeviation/(n-1)));

		// 1.4
		System.out.println("\n1.4");
		int [] arrays=new int[20];
		int j=0;
		while(sc.hasNext()) {
			int a=sc.nextInt();
			if (a==0) break;
			arrays[j]=a;
			j++;
		}
		int[] array = Arrays.copyOfRange(arrays, 0, j);
		System.out.println("len array: "+array.length);
		
		int max_len_same = 1;
		int len_same = 1;
		int num_same = 0;
		
		for(int i=1;i<=array.length;i++) {
			if (i==array.length || array[i]!=array[i-1]) {
				if (max_len_same <= len_same) {
					max_len_same = len_same;
					num_same = array[i-1];
				}
				len_same = 1;
			}
			else len_same++;
		}
		System.out.println("num: "+num_same+"; len: "+max_len_same);
		
		
		// 1.6
		System.out.println("\n1.6");
		int [] ar_s=new int[20];
		int k=0;
		while(sc.hasNext()) {
			int a=sc.nextInt();
			if (a==0) break;
			ar_s[k]=a;
			k++;
		}
		int[] ar=new int[k],len=new int[k];
		for (int i=0;i<k;i++) {
			ar[i]=ar_s[i];
			len[i]=Integer.toString(ar_s[i]).length();
		}
		int l=min(len);
		for (int i=0;i<ar.length;i++) {
			if (len[i]==l)
				System.out.printf("%d ",ar[i]);
		}
		
		
		
		//1.8 (dz)
		System.out.println("\n\n1.8 (dz)");
		String [] mas= {"234", "67", "86", "21", "32","1"};
		//for (int i=0;i<5;i++)
			//mas[i]=sc.next();

		for (int i=0;i<mas.length;i++){
			if (fun1_8(mas[i]))
				System.out.printf("%s ",mas[i]);
		}
		sc.close();

	}

}
