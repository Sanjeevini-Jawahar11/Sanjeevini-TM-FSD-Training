package LibraryManagementSystem;

import java.util.ArrayList;
import java.lang.Exception;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManger extends LibrarySystem {
//	ArrayList<Book> isbn=new ArrayList<>();
	Map<String,String> reserved=new HashMap<>();
	LibraryManger() {

	}

	@Override
	public void borrowBook(String ISBN, String userID) {
		books.remove(ISBN);

	}

	public void returnBook(String ISBN, String userID) {
		reserved.remove(userID,ISBN);

	}

	public void searchBook(String title) {
		try {
			if (books.contains(title)) {
				return;
			} else {
				throw new BookNotFoundException("Book is Not Available");
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void reserveBook(String ISBN, String userID) {
		reserved.put(userID,ISBN);
		

	}

	public void addBook(Book book) {
		books.add(book);

	}

	public void addUser(User user) {
		users.add(user);
	}


}
