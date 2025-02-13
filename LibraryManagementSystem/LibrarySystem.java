package LibraryManagementSystem;

import java.util.List;

public abstract class LibrarySystem implements ILibrary {
	protected List<Book> books;
	protected List<User> users;
	
	abstract void addBook(Book book);

	abstract void addUser(User user);



	

}
