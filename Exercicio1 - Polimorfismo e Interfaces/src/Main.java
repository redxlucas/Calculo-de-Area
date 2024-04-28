public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 10);
		Triangle triangle = new Triangle(5, 10);
		Circle circle = new Circle(7);
		
		System.out.println("Área do Retângulo = " + rectangle.calculateArea());
		System.out.println("Área do Triângulo = " + triangle.calculateArea());
		System.out.println("Área do Círculo = " + circle.calculateArea());

	}

}
