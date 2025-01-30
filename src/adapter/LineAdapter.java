package adapter;

public class LineAdapter implements Shape{

	private LegacyLine legacyLine;
	
	public LineAdapter(LegacyLine legacyLine) {
		this.legacyLine=legacyLine;
	}
	
	@Override
	public void draw() {
		this.legacyLine.drawLine(0, 0, 50, 50);
	}
}
