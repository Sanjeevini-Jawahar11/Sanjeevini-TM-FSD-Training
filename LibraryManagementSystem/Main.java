package LibraryManagementSystem;

import java.util.Scanner;
import java.lang.Exception;

public class Main extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManger librarymanager = new LibraryManger();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Library...");
		System.out.println("Enter your name:");
		String name = scanner.next();
		System.out.println("Enter your uderId:");
		String userID = scanner.next();
		System.out.println("Choose your interest");
		System.out.println("1.Borrow Book:");
		System.out.println("2.Return Book:");
		int choose = scanner.nextInt();
		Boolean exit=true;
		while (exit) {
			switch (choose) {
			case 1: {
				System.out.println("1.New user:");
				System.out.println("2.Existing user:");
				int usertype = scanner.nextInt();
				if (usertype == 1) {
					User user = new User(name, userID,null);
					librarymanager.addUser(user);
					System.out.println("Your Details are successfully added...");
					System.out.println("------------------------------------------");
					}
				else {
					System.out.println("Enter the number of books that you have borrowed already?:");
				}
				System.out.println("Enter the title of the Book you want: ");
				String bookname=scanner.next();
				librarymanager.searchBook(bookname);
				librarymanager.reserveBook(bookname, userID);
				librarymanager.borrowBook(bookname, userID);
				System.out.println("--------------------------------------------");
				System.out.println("You have succesfully borrowed your book....");
				break;
			}
			case 2: {
				System.out.println("Enter the title of the Book you want to return: ");
				String bookname=scanner.next();
				librarymanager.returnBook(bookname, userID);break;
			}
			default:
				exit=false;

			}
		}


		}

	}

