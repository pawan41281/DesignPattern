package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Box box = new SimpleBox();
		box.assemble();
		
		ColorBoxDecorator colorBoxDecorator = new ColorBoxDecorator(new SimpleBox());
		colorBoxDecorator.assemble();
		
	}
}
