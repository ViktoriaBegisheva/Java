package task8_5_dz;

import java.util.LinkedList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

class Date {
	String date;
	
	Date(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		date = dtf.format(now);
	}  
	
}

class Reader{
	String surname;
	int id;
	LinkedList<Book> books;
	
	Reader(String surname,int id){
		this.surname=surname;
		this.id=id;
		books = new LinkedList<>();
	}
	
	public boolean removeBook(Book book) {
		for (Book b:books) {
			if (b.equals(book)) {
				books.remove(b);
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return id+" & "+surname;
	}

	@Override
	public String toString() {
		return id+" "+surname+", books: "+books;
	}
}

public class Catalog {
	
	class History{
		LinkedList<Object[]> history;//date, Reader, Book, status
		
		History(){
			history = new LinkedList<>();
		}
		
		public void addToHistory(String process,Reader reader,Book book) {
			history.add(new Object[4]);
			Date d=new Date();
			history.getLast()[0]=d.date;
			history.getLast()[1]=reader.getName();
			history.getLast()[2]=book.getName();
			history.getLast()[3]=process;
		}
		

		public String toString() {
			String s = "\nDate                | Reader(id&surname)"
					+ " | Name of Book            | status\n"
					+ "____".repeat(20);
			for(Object[] o:history) 
				s+="\n"+o[0]+" |     "+o[1]
						+ "    | "+o[2]+" | "+o[3];
			return s;
			
		}
		
	}
	
	LinkedList<Book> books;
	LinkedList<Reader> readers;
	History history;
	
	Catalog(){
		books = new LinkedList<>();
		readers = new LinkedList<>();
		history = new History();
	}
	
	Catalog(LinkedList<Book> books){
		this.books=books;
		readers = new LinkedList<>();
		history = new History();
	}
	
	Catalog(LinkedList<Book> books,LinkedList<Reader> readers){
		this.books=books;
		this.readers=readers;
		history = new History();
	}
	
	public Book addBook(Book book) {
		books.add(book);
		return book;
	}
	
	public boolean removeBook(Book book) {
		for (Book b:books) {
			if (b.equals(book)) {
				books.remove(b);
				return true;
			}
		}
		return false;
	}
	
	public Reader addReader(Reader reader) {
		if (!readers.contains(reader))
			readers.add(reader);
		return reader;
	}
	
	public Book getBook(EnumBooks book,String name,String author) {
		Book b = null;
		switch (book){
			case DIRECTORY:
				b = new Directory(name,author);
				break;
			case ENCYCLOPEDIA:
				b = new Encyclopedia(name,author);
				break;
			case MAGAZINE:
				b = new Magazine(name,author);
				break;
		}
		return b;
	}
	
	public Book orderBook(Reader reader,EnumBooks book,String name,String author) {
		Book b = getBook(book,name,author);
		System.out.println("TAKES BOOK! Reader: "+reader.getName()+" Book: "+b);
		if (!b.equals(null)) {
			if (!removeBook(b)) {
				System.out.println("error");
				return null;
			}
			readers.remove(reader);
			reader.books.add(b);
			history.addToHistory("takes",reader,b);
		}
		addReader(reader);
		return b;
	}
	
	public Book returnedBook(Reader reader, EnumBooks book,String name,String author) {
		Book b = null;
		b = getBook(book,name,author);
		System.out.println("RETURNS BOOK! Reader: "+reader.getName()+" Book: "+b);
		if (!reader.removeBook(b)){
			System.out.println("error");
			return null;
		}
		if (!b.equals(null)) {
			books.add(b);
			history.addToHistory("returns",reader,b);
		}
		addReader(reader);
		return b;
	}
	
	public void seeHistory() {
		System.out.println(history);
	}
	

}
