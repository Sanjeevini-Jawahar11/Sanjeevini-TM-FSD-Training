package FSD_Assignments;

public class User {
	private String name;
	private int age;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	User(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "["+name+","+age+","+phoneNumber+"]";
	}
	@Override
	public boolean equals(Object object) {
		if(this==object) {
			return true;
		}
		if((object==null)||(getClass()!=object.getClass())) {
			return false;
		}
		User user=(User)object;
		if((age==user.age)&&(phoneNumber==user.phoneNumber)&&(name==user.name)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
