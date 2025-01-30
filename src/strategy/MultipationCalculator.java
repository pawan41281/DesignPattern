package strategy;

public class MultipationCalculator implements Calculator{

	@Override
	public void calculate(int num1, int num2) {
		System.out.println("Result = " + (num1*num2));
	}
}
