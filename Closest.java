package lab4;
import java.util.Scanner;

class Point{
	
	int x;
	int y;
	int z;
	
	Point(int x0,int y0,int z0){
		x=x0;
		y=y0;
		z=z0;
	}
	
	double dictans(Point p1) {
		return Math.sqrt(Math.pow(p1.x-x,2)+Math.pow(p1.y-y,2)+Math.pow(p1.z-z,2));
	}
	
	void showPoint() {
		System.out.println("("+x+" "+y+" "+z+")");
	}
}
public class Closest {

	public static void main(String[] args) {
		// 1.5
		Scanner sc = new Scanner(System.in);
		System.out.println("1.5");

		int x0,y0,z0;
		if(args.length<3) {
			System.out.println("Not enough input arguments!");
			return;
		}
		x0 = Integer.valueOf(args[0]);
		y0 = Integer.valueOf(args[1]);
		z0 = Integer.valueOf(args[2]);
		Point p0=new Point(x0,y0,z0);
		p0.showPoint();
		
		System.out.printf("n = ");
		int n=sc.nextInt();
		Point[] masPoint=new Point[n];
		double[] masDistan=new double[n];
		for (int i=0;i<n;i++) {
			System.out.println("Input point(x,y,z)"+(i+1));
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			Point p=new Point(x,y,z);
			masPoint[i]=p;
			masDistan[i]=p.dictans(p0);
		}
		double maxDist=masDistan[0];
		int maxInd=0;
		for (int i=0;i<masDistan.length;i++)
			if (maxDist>=masDistan[i]) {
				maxDist=masDistan[i];
				maxInd=i;
			}
		
		System.out.printf("Closest point: ");
		masPoint[maxInd].showPoint();
		System.out.println("Distanse: "+maxDist);
		

		sc.close();
	}

}
