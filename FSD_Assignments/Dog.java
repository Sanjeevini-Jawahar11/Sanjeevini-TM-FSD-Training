package FSD_Assignments;

public class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The Dog is Barking..Bow Bow");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.makeSound();

	}

}
