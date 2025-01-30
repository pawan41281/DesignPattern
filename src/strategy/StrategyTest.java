package strategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		Calculator additionCalc = new AdditionCalculator();
		Calculator multipicationCalc = new MultipationCalculator();
		
		MyCalculator calc1 = new MyCalculator(additionCalc);
		calc1.calculate(10, 20);
		
		MyCalculator calc2 = new MyCalculator(multipicationCalc);
		calc2.calculate(10, 20);
	}
}
