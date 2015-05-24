import java.lang.Math;
public abstract class Shape {
	protected double length;
	
	public Shape(double length){
		this.length = length;	
	}
	
	public abstract void setLength(double length);
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public String getInfo(){
		
		String a = "Area = "+ this.getArea() +", Perimeter = " + this.getPerimeter();
		return a;
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}
