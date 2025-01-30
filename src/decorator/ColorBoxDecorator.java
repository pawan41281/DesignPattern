package decorator;

public class ColorBoxDecorator extends BoxDecorator{

	public ColorBoxDecorator(Box box) {
		super(box);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Box decorated with colors");
	}
}
