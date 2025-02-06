package FSD_Assignments;

public class Utility {
	public static final String ENGINE_STARTED = "Car Engine has Started.";
	public static final String BATTERY_CHARGED = "of Battery is Charged.";
	public static int integerLength(int number) {
		int count=0;
		while(number>0) {
			count+=1;
			number/=10;
		}
		return count;
		
	}
}
