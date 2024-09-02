public class Main {

	public static void main(String[] args) 
	{
		// Square
		Square square = new Square("White", "Square", 10);
		square.calculateArea();
		System.out.println(square);
		// Rectangle
		Rectangle rectangle = new Rectangle("Black", "Rectangle", 10, 5);
		rectangle.calculateArea();
		System.out.println(rectangle);
		//Triangle
		Triangle triangle = new Triangle("Pink", "Triangle", 5, 10);
		triangle.calculateArea();
		System.out.println(triangle);
		//Circle
		Circle circle = new Circle("Gray", "Circle", 90);
		circle.calculateArea();
		System.out.println(circle);
        	
	}
}
