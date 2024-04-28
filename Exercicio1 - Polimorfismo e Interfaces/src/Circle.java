public class Circle implements Shapes{
	
	private double radius;
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public double calculateArea() {
		
		return radius * radius * 3.14;
	}

}
