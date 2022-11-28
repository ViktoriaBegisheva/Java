package lab11_bin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

interface Expression{
    boolean function(int a);
}

public class task6_3_dz {

	public static int[] toIntArray(byte[] bytes) {
		int t = Integer.SIZE/Byte.SIZE;
		int[] arr = new int[bytes.length/t];
		for(int i=0;i<arr.length;i++)
			arr[i]=ByteBuffer.wrap(bytes,i*t,t).getInt();
		return arr;
	}
	
	public static void writeToBinary(String fname,int[] arr) throws IOException {
		try(OutputStream outputStream = new FileOutputStream(fname);){
			ByteBuffer bb = ByteBuffer.allocate(arr.length*4);
			for (int a:arr)
				bb.putInt(a);
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
	
	// 6.3 a-c
	static int[] bildArray(int[] arr,Expression f) {
		int[] newArr = new int[arr.length];
		int k=0;
		for (int a:arr){
			if (f.function(a)){
				newArr[k]=a;
				k++;
			}
		}
		int[] ans =	new int[k];
		for (int i=0;i<k;i++)
			ans[i]=newArr[i];
		
		return ans;
	}
	
	static void printArray(int[] arr) {
		for(int i:arr)
			System.out.printf("%d ", i);
		System.out.println();
	}
	
	static int reverInt(int a) {
		int b=0,i=Integer.toString(Math.abs(a)).length();
		while (a!=0) {
			b+=(a-(a/10)*10)*Math.pow(10,--i);
			a/=10;
		}
		return b;
	}

	// 6.3 d
	static int[] reversNumArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int k=0;
		for (int a:arr){
			newArr[k]=reverInt(a);
			k++;
		}
		return newArr;
	}
	
	// 6.3 e
	static int[] withoutDublArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int k=0;
		for (int i=0;i<arr.length;i++) {
			boolean p = false;
			for(int j=0;j<i;j++) {
				if (newArr[j]==arr[i]) {
					p=true;
					break;
				}
			}
			if (p)
				continue;
			newArr[k]=arr[i];
			k++;
		}

		int[] ans =	new int[k];
		for (int i=0;i<k;i++)
			ans[i]=newArr[i];
		
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		// 6.3 dz
		String inpFile = "file1";
		String outpFile = "file2";
		int[] num = {1, 4, -5, 25, 64, 15, 2, 45, 3455, 5780, 4, 6, 1};
		writeToBinary(inpFile,num);
		
		int[] arr = toIntArray(readFromBinary(inpFile));
		printArray(arr);
		
		Expression a = (x)->x/2==(float)x/2;
		writeToBinary(outpFile,bildArray(arr,a));
		int[] arr_a = toIntArray(readFromBinary(outpFile));
		printArray(arr_a);
		
		Expression b = (x)->(x/3==(float)x/3)&&(x/5==(float)x/5);
		writeToBinary(outpFile,bildArray(arr,b));
		int[] arr_b = toIntArray(readFromBinary(outpFile));
		printArray(arr_b);
		
		Expression c = (x)->Math.sqrt(x)==(int)Math.sqrt(x);
		writeToBinary(outpFile,bildArray(arr,c));
		int[] arr_c = toIntArray(readFromBinary(outpFile));
		printArray(arr_c);

		writeToBinary(outpFile,reversNumArray(arr));
		int[] arr_d = toIntArray(readFromBinary(outpFile));
		printArray(arr_d);

		writeToBinary(outpFile,withoutDublArray(arr));
		int[] arr_e = toIntArray(readFromBinary(outpFile));
		printArray(arr_e);
		

	}

}
