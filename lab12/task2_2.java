package lab12;

public class task2_2 {

	public static void main(String[] args) {
		// 1.13
		
		int[] arr = {4,5,8,-7,-1,-5,9,4,2,-8,3,-11,6};
		int x = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<x) {
				for (int j=i;j<arr.length;j++) {
					if (arr[j]>x) {
						arr[i] = arr[i] + arr[j] -(arr[j]=arr[i]) ;
						break;
					}
				}
			}
		}
		for (int i:arr)
			System.out.printf("%d ", i);

	}

}
