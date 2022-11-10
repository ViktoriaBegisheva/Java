package task7_1;

public class Task7_1 {

	public static void main(String[] args) {
		// 7.11
		Book[] books = new Book[4];
		books[0] = new Directory("Ukrainian Directory","A.B.",250);
		books[1] = new Encyclopedia("Big children's Encyclopedia","A.C.",175);
		books[2] = new Directory("English Directory","C.B.",320);
		books[3] = new Encyclopedia("Animal Encyclopedia","D.F.",700);
		for (Book b: books) {
			System.out.println(b);
			b.printb();
			b.advertise();
			b.popular();
			System.out.println();
			
		}
		
	}

}
