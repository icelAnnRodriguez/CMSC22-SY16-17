public class Square extends Rectangle {
	private static final double SIDE = 1.0;


	public Square() {
		super(SIDE, SIDE);
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return super.getWidth();
	}

	public void setSide(double side) {
		super.setWidth(side);
	}

	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}

	@Override
	public void setLength(double side) {
		super.setLength(side);
	}

	@Override
	public String toString() {
		return String.format("A square with side = %f, which is a subclass of %s", getSide(), super.toString());
	}
}