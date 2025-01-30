package decorator;

public class SimpleBox implements Box{

	@Override
	public void assemble() {
		System.out.println("Created a simple box");
	}
}
