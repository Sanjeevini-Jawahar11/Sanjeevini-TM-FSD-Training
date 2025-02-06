package FSD_Assignments;

public class CarTest {

	public static void main(String[] args) {

		Car[] cars = { new Car("Toyota", "Corolla", 2020), new ElectricCar("Tesla", "Model S", 2022, 400),
				new Car("Honda", "Civic", 2019), new ElectricCar("Nissan", "Leaf", 2021, 150) };
		for (Car car : cars) {
			car.startEngine();
		}
	}

}
