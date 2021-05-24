package Q1;

public class Shape {
	// Private member variable
	private String color;
	//constructor
	public Shape (String color) {
		this.color=color;
	}
  
   public String toString() {
	   return "Shape of color=\"" + color + "\"";
   }
   
   // All shapes must has a method called getArea()
   public double getArea() {
	   System.out.println("Shape unknown! Cannot compute area!");
	   return 0;   // Need a return to compile the program
   }

	public static void main(String[] args) {
		

	}

}
