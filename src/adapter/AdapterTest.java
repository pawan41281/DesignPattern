package adapter;

public class AdapterTest {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		
		LegacyLine legacyLine = new LegacyLine();
		Shape line = new LineAdapter(legacyLine);

		rectangle.draw();
		circle.draw();
		line.draw();
		
	}
}
