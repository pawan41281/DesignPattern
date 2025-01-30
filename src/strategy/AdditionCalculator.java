package strategy;

public class AdditionCalculator implements Calculator{

	@Override
	public void calculate(int num1, int num2) {
		System.out.println("Result = " + (num1+num2));
	}
}
