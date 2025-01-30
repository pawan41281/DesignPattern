package builder;

public class BuilderTest {

	public static void main(String[] args) {
		Car xl6 = new Car
						.Builder("Maruti", "XL6")
						.build();
		
		System.out.println(xl6);
		
		Car tharAMT = new Car
							.Builder("Mahindra","Thar")
							.setTransmissionType("AMT")
							.build();
		
		System.out.println(tharAMT);
	}
}
