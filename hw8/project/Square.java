import javax.annotation.processing.RoundEnvironment;

public class Square extends Shape {
	
	public Square(double length) {
		super(length);
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		double a = round(length*length, 2);
		
		return length*length;
	}

	@Override
	public double getPerimeter() {
		return 4*length;
	}

	

}
