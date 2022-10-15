package lab4;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task4 {
	
	public static int getDayNumberOld(Date date) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static void main(String[] args) throws ParseException {
		
		
		//4.3 (dz)
		String str_date="01/01/";
		int sun = 0, sat = 0;
		for (int i=0; i<400; i++) {
			String date=str_date+Integer.toString(2000+i);
			Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			int num=getDayNumberOld(d);
			if (num==7)
				sat++;
			else if (num==1)
				sun++;
		}
		System.out.println("Saturday: "+sat+"; Sunday: "+sun);
		
		//4.4
		int k=0,n=5;
		for (int i=10;i<=99;i++) {
			if (k<n-1) {
				System.out.printf("%d ", i);
				k++;
			}
			else {
				System.out.printf("%d\n", i);
				k=0;
			}
		}
		
		//4.5
		int k0=0,n0=100;
		for (int i=1;i<=1000;i++) {
			String s = Integer.toString(i);
			if (s.length()==1) s="   "+s;
			else if (s.length()==2) s="  "+s;
			else if (s.length()==3) s=" "+s;
			if (k0<n0-1) {
				System.out.printf("%s ", s);
				k0++;
			}
			else {
				System.out.printf("%s\n", s);
				k0=0;
			}
		}
		
	}

}
