package lab11_bin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task6 {

	public static double[] toDoubleArray(byte[] bytes) {
		int t = Double.SIZE/Byte.SIZE;
		double[] doub = new double[bytes.length/t];
		for(int i=0;i<doub.length;i++)
			doub[i]=ByteBuffer.wrap(bytes,i*t,t).getDouble();
		return doub;
	}
	
	public static void writeToBinary(String fname,double[] arr) throws IOException {
		try(OutputStream outputStream = new FileOutputStream(fname);){
			ByteBuffer bb = ByteBuffer.allocate(arr.length*8);
			for (double a:arr)
				bb.putDouble(a);
			byte[] bytearr = bb.array();
			outputStream.write(bytearr);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static byte[] readFromBinary(String fname) throws IOException {
		byte[] allBytes = Files.readAllBytes((Paths.get(fname)));
		return allBytes;
	}
	
	// 6.1
	static double sum(double[] arr) {
		double sum=0;
		for (double d:arr)
			sum+=d;
		return sum;
	}
	
	// 6.2
	static double dob(double[] arr) {
		double dob=1;
		for (double d:arr) {
			if (d==0)
				continue;
			dob*=d;
			
		}
		return dob;
	}
	
	// 6.3
	static double dobPar(double[] arr) {
		double dob=1;
		for (int i=0;i<arr.length;i++) {
			if (i/2!=(float)i/2)
				continue;
			dob*=arr[i];
			
		}
		return dob;
	}
	
	public static void main(String[] args) throws IOException {
		// 
		String inpFile = "file1";
		String outpFile = "file2";
		double[] num = {1.1f,2.5f,-2.7f,9.9f,-0.01f,0.0f};
		writeToBinary(inpFile,num);
		double[] arr = toDoubleArray(readFromBinary(inpFile));
		for(double a:arr)
			System.out.printf("%.2f ", a);
		System.out.println();
		writeToBinary(outpFile,new double[] {sum(arr),dob(arr),dobPar(arr)});
		for(double a: 
			toDoubleArray(readFromBinary(outpFile)))
			System.out.println(a);
		

	}

}
