public class Circle extends Shape {
	
	public Circle(double length) {
		super(length);
	}
	
	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return round(Math.PI*(length/2)*(length/2),2);
	}

	@Override
	public double getPerimeter() {
		return round(2*Math.PI*(length/2), 2);
	}

	
}
