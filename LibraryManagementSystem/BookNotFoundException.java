package LibraryManagementSystem;

public class BookNotFoundException extends Exception {
String string;
	public BookNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
	}
	public String getMessage() {
		return string;
	}
	

}
