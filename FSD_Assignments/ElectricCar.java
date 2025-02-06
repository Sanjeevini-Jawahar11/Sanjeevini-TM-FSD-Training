package FSD_Assignments;

public class ElectricCar extends Car {
	private int batteryRange;

	ElectricCar(String make, String model, int year, int batteryRange) {
		super(make, model, year);
		this.batteryRange = batteryRange;
	}

	public int getBatteryRange() {
		return batteryRange;
	}

	public void setBatteryRange(int batteryRange) {
		this.batteryRange = batteryRange;
	}

	public void chargeBattery() {
		System.out.println(batteryRange + " " + Utility.BATTERY_CHARGED);
	}

	@Override
	public void startEngine() {
		chargeBattery();
		System.out.println(getYear() + " " + getMake() + " " + getModel() + " " + Utility.ENGINE_STARTED);
	}

}
