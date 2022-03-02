package samp_pgm;

import java.util.HashMap;


public class samp_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		Thread t = new Thread();
		t.start();
		
		t.join();
		if (returnBook() == error)
			System.out.println("Error on returning book");
		
		if (addBook() == error)
			System.out.println("Error on returning book");
		
		if (borrowBook() == error)
			System.out.println("Error on returning book");
	}
	
	public synchronized HashMap<String, Integer> addBook(String BookName ) {
		
		return map.put(BookName, i);

	}
	
	public synchronized HashMap<String, Integer> returnBook(String BookName ) {
		
		String BookName = "";
		Integer i = map.get(BookName);
		i = i+1;
		if(i> MAX_BOOK_COUNT)
			return error;
		else
			return map.put(BookName, i);

	}
	
	public synchronized HashMap<String, Integer> borrowBook(String BookName) {
		
		String BookName = null;
		Integer i = map.get(BookName);
		i = i-1;
		if (i < 0)
			return error;
		else
			return map.put(BookName, i);

	}
	
	public int quantity(HashMap<String, Integer> map) {
		/**
		 * Create iterator on entry to traverse and get value(count) of books available
		 */
		return map.getValue(BookName);
		
	}


}
