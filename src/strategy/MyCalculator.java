package strategy;

public class MyCalculator {

	private Calculator calculator;

	public MyCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void calculate(int num1, int num2) {
		calculator.calculate(num1, num2);
	}
}
