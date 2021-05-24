package Q1;

public class Triangle extends Shape{
	
	//private member variables
	private int base;
	private int height;
	
	//constructor
	public Triangle(String color, int base, int height) {
		super(color);
		this.base= base;
		this.height= height;
		}
	public String toString() {
		return  "Triangle of base=" + base + " and height=" + height + ",subclass of " + super.toString();
		}
	public double getArea() {
		return 0.5*base*height;
	}
	}


