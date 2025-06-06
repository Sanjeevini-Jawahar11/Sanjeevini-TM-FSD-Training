package LibraryManagementSystem;
import java.util.List;

public class User {
	private String name;
	private String userID;
	private List<Book> borrowedBooks;
	User(String name,String userID, List<Book> borrowedBooks){
		this.name=name;
		this.userID=userID;
		this.borrowedBooks=borrowedBooks;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

}
