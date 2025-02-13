package LibraryManagementSystem;

public interface ILibrary {
	public abstract void borrowBook(String ISBN, String userID);
	public abstract void returnBook(String ISBN, String userID);
	public abstract void reserveBook(String ISBN, String userID);
	public abstract void searchBook(String title);

}
