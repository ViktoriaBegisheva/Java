package lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class task2_1 {
	public static void main(String[] args) {
		// 2.1
		// Compare time of printing list
		// use ArrayList and LinkedList
		
		Integer[] people = {1,2,3,4,5,6,7,8,9,10};
		
		int n = 500;
		
		// ArrayList
		ArrayList<Integer> ArrLst = new ArrayList<Integer>(Arrays.asList(people));
		long m1 = System.currentTimeMillis();
		
		for (int j=0;j<n;j++) {
			for(int i=0;i<ArrLst.size();i++) 
			    System.out.print(ArrLst.get(i));
			
		}
		System.out.println();
		double time1 = (double) (System.currentTimeMillis() - m1)/n;
		
		// LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(people));
		long m2 = System.currentTimeMillis();

		for (int j=0;j<n;j++) {
			for(int i=0;i<linkedList.size();i++)
				System.out.print(linkedList.get(i));
		}
		System.out.println();
		double time2 = (double) (System.currentTimeMillis() - m2)/n;
		
		// Compare time 
        System.out.println("ArrayList: "+time1+"; LinkedList: "+time2);
        if (time1>time2)
        	System.out.println("LinkedList faster!");
        else if (time2>time1)
        	System.out.println("ArrayList faster!");
	}

}
