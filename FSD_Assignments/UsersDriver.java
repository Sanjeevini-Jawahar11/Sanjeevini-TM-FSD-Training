package FSD_Assignments;

public class UsersDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User("Sanjeevini",21,"9361889702");
		User user2=new User("Sanjeevini",21,"9361889702");
		SecondUser seconduser=new SecondUser("Sanjeevini",21,"9361889702");
		SecondUser seconduser2=new SecondUser("Sanjeevini",21,"9361889702");
		//Comparing Objects using toString()
		System.out.println("User class with toString() Overiden: "+user.toString());
		System.out.println("SecondUser class without toString() Overiden: "+seconduser);
		//Comparing Object using equals()
		System.out.println("Comparing user and user2 by overriding equals(): "+user.equals(user2));
		System.out.println("Comparing seconduser and seconduser2 without overriding equals(): "+seconduser.equals(seconduser2));
		
		

	}

}
