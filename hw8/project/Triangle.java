
public class Triangle extends Shape {
	public Triangle(double length) {
		super(length);
	}

	public void setLength(double length){
		this.length = length;
	}

	@Override
	public double getArea() {
		double a = round((length * Math.sqrt(3)* length)/4, 2);
		return a;
	}

	@Override
	public double getPerimeter() {
		return round(3*length, 2);
	}
}
