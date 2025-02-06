package FSD_Assignments;

public final class TestFinal {
	public static final void finalMethod() {
		System.out.println("This is a FinalMethod.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int variable = 5;
//		variable=7;cannot change the value 
		/*
		 * cannot inherit and override this class because the class and method are final
		 */
		System.out.println(variable);

	}

}
