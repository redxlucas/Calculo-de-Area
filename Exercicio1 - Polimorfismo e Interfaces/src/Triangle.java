public class Triangle implements Shapes {
	
	private double heigth;
	private double base;
	
	public Triangle (double heigth, double base) {
		
		this.heigth = heigth;
		this.base = base;
	}
	
	public double calculateArea(){
		
		return heigth * base / 2;
	}
}
