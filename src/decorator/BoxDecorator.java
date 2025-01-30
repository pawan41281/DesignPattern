package decorator;

public class BoxDecorator implements Box{

	private Box box;
	
	public BoxDecorator(Box box) {
		this.box=box;
	}
	
	public void assemble() {
		this.box.assemble();
	}
}
