package task8_5_dz_with_exceptions;

import java.util.LinkedList;


public class Task8_5_dz_with_exceptions {

	public static void main(String[] args) {
		
		LinkedList<Book> books= new LinkedList<Book>();
		books.add(new Directory("Ukrainian Directory","A.B."));
		books.add(new Encyclopedia("Big children's Encyclopedia","A.C."));
		books.add(new Directory("English Directory","C.B."));
		books.add(new Encyclopedia("Animal Encyclopedia","D.F."));
		books.add(new Directory("French Directory","K.B."));
		books.add(new Directory("German Directory","A.L."));
		books.add(new Magazine("NEW Magazine","V.P."));
		books.add(new Magazine("Children's Magazine","H.P."));
		books.add(new Encyclopedia("NEW Encyclopedia","G.F."));
		books.add(new Encyclopedia("BIG Encyclopedia","J.E."));
		

		Catalog catalog = new Catalog(books);
		Reader r1 = new Reader("Aaaa",1004);
		Reader r2 = new Reader("Bbbb",2005);
		Reader r3 = new Reader("Cccc",1206);
		Reader r4 = new Reader("Dddd",2370);
		Reader r5 = new Reader("Gggg",3446);
		
		
		catalog.orderBook(r1, EnumBooks.DIRECTORY, "Ukrainian Directory","A.B.");
		catalog.orderBook(r2, EnumBooks.ENCYCLOPEDIA, "Animal Encyclopedia","D.F.");
		catalog.returnedBook(r1, EnumBooks.DIRECTORY, "Ukrainian Directory","A.B.");
		catalog.returnedBook(r1, EnumBooks.DIRECTORY, "Ukrainian Directory","A.B.");
		catalog.orderBook(r3, EnumBooks.DIRECTORY, "Ukrainian Directory","A.B.");
		catalog.orderBook(r5, EnumBooks.MAGAZINE, "Magazine","H.P.");
		catalog.orderBook(r5, EnumBooks.ENCYCLOPEDIA, "BIG Encyclopedia","J.E.");
		catalog.returnedBook(r2, EnumBooks.ENCYCLOPEDIA, "Animal Encyclopedia","D.F.");
		catalog.returnedBook(r5, EnumBooks.ENCYCLOPEDIA, "BIG Encyclopedia","J.E.");
		catalog.returnedBook(r4, EnumBooks.MAGAZINE, "Children's Magazine","H.P.");
		
		
		catalog.seeHistory();
		

	}

}
